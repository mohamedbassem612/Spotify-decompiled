package p;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class won1 implements p331 {
    public final /* synthetic */ byte a = 2;
    public final Status b;

    public won1(wpn1 wpn1Var, Status status) {
        this.b = status;
        Objects.requireNonNull(wpn1Var);
    }

    public final Status getStatus() {
        byte b = this.a;
        return this.b;
    }

    public won1(jub1 jub1Var, Status status) {
        this.b = status;
    }

    public won1(Status status) {
        this.b = status;
    }
}
