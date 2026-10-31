package androidx.car.app.model;

import java.util.Objects;
import p.d2q0;
import p.l1d;
import p.qrd;
import p.zye1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;
    private final d2q0 mOnCheckedChangeDelegate;

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    public d2q0 getOnCheckedChangeDelegate() {
        d2q0 d2q0Var = this.mOnCheckedChangeDelegate;
        Objects.requireNonNull(d2q0Var);
        return d2q0Var;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsChecked), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ isChecked: ");
        sb.append(this.mIsChecked);
        sb.append(", isEnabled: ");
        return l1d.r(sb, this.mIsEnabled, "]");
    }

    public Toggle(zye1 zye1Var) {
        throw null;
    }
}
