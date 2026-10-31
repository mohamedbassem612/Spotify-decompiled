package androidx.car.app.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p.a80;
import p.e4p1;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class ActionStrip {
    private final List<Action> mActions;

    public ActionStrip(a80 a80Var) {
        this.mActions = e4p1.w(a80Var.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActionStrip) {
            return Objects.equals(this.mActions, ((ActionStrip) obj).mActions);
        }
        return false;
    }

    public List<Action> getActions() {
        List<Action> list = this.mActions;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public Action getFirstActionOfType(int i) {
        for (Action action : this.mActions) {
            if (action instanceof Action) {
                Action action2 = action;
                if (action2.getType() == i) {
                    return action2;
                }
            }
        }
        return null;
    }

    public int hashCode() {
        return Objects.hashCode(this.mActions);
    }

    public String toString() {
        return "[action count: " + this.mActions.size() + "]";
    }

    private ActionStrip() {
        this.mActions = Collections.EMPTY_LIST;
    }
}
