package androidx.car.app.model;

import java.util.Objects;
import p.e2q0;
import p.f2q0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class ClickableSpan extends CarSpan {
    private final e2q0 mOnClickDelegate;

    private ClickableSpan(f2q0 f2q0Var) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(f2q0Var);
    }

    public static ClickableSpan create(f2q0 f2q0Var) {
        Objects.requireNonNull(f2q0Var);
        return new ClickableSpan(f2q0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        return Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(((ClickableSpan) obj).mOnClickDelegate == null));
    }

    public e2q0 getOnClickDelegate() {
        e2q0 e2q0Var = this.mOnClickDelegate;
        Objects.requireNonNull(e2q0Var);
        return e2q0Var;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mOnClickDelegate == null));
    }

    public String toString() {
        return "[clickable]";
    }

    private ClickableSpan() {
        this.mOnClickDelegate = null;
    }
}
