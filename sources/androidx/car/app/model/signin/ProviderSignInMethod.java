package androidx.car.app.model.signin;

import androidx.car.app.model.Action;
import java.util.Objects;
import p.e2q0;
import p.hhg1;
import p.qrd;
import p.rj81;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class ProviderSignInMethod implements rj81 {
    private final Action mAction;

    public ProviderSignInMethod(Action action) {
        Objects.requireNonNull(action);
        if (action.getType() != 1) {
            hhg1.n("The action must not be a standard action");
            throw null;
        }
        e2q0 onClickDelegate = action.getOnClickDelegate();
        Objects.requireNonNull(onClickDelegate);
        if (onClickDelegate.isParkedOnly()) {
            this.mAction = action;
        } else {
            hhg1.n("The action must use a ParkedOnlyOnClickListener");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderSignInMethod) {
            return Objects.equals(this.mAction, ((ProviderSignInMethod) obj).mAction);
        }
        return false;
    }

    public Action getAction() {
        Action action = this.mAction;
        Objects.requireNonNull(action);
        return action;
    }

    public int hashCode() {
        return Objects.hash(this.mAction);
    }

    public String toString() {
        return "[action:" + this.mAction + "]";
    }

    private ProviderSignInMethod() {
        this.mAction = null;
    }
}
