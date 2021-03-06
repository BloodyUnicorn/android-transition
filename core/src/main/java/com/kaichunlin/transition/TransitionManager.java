package com.kaichunlin.transition;

import java.util.List;

/**
 * Allows the adaption of different UI interactive components (e.g. Drawer) to support transition effects.
 */
public interface TransitionManager extends TransitionOperation {

    /**
     * Same as calling addTransition(transitionBuilder.build()).
     *
     * @param transitionBuilder
     */
    void addTransition(AbstractTransitionBuilder transitionBuilder);

    /**
     * Adds a transition.
     *
     * @param transition
     */
    void addTransition(Transition transition);

    void addAllTransitions(List<Transition> transitionsList);

    /**
     * Removes a transition, should not be called while transition is in progress.
     *
     * @param transition
     * @return true if a transition is removed, false otherwise.
     */
    boolean removeTransition(Transition transition);

    List<Transition> getTransitions();

    /**
     * Stops and clears all transitions.
     */
    void removeAllTransitions();

    void addTransitionListener(TransitionManagerListener listener);

    void removeTransitionListener(TransitionManagerListener listener);

    void notifyTransitionStart();

    void notifyTransitionEnd();
}