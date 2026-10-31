package p;

import android.content.Context;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e6u0 {
    public static final Set d = dm61.z0("SEEK_15_SECONDS_FORWARD", "SEEK_15_SECONDS_BACK");
    public final String a;
    public final bpb1 b;
    public final bpb1 c;

    public e6u0(Context context) {
        this.a = context.getPackageName();
        bpb1 bpb1VarB = gio1.b(c6u0.a);
        this.b = bpb1VarB;
        this.c = bpb1VarB;
        new d6u0(this);
    }

    public final CompletableFromAction a(b6u0 b6u0Var) {
        return new CompletableFromAction(new wqd0(this, b6u0Var));
    }

    public final void b() {
        this.b.getValue();
    }

    public final boolean c(String str) {
        return u890.j(str, this.a) || u890.j(str, "com.android.systemui") || nhc1.Y(str, "com.android.systemui.", false) || str.equals("com.android.bluetooth") || str.equals("com.google.android.bluetooth") || str.equals("android.media.session.MediaController");
    }
}
