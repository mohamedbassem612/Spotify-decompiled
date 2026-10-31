package p;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jw7 implements zj {
    public final ynb0 a;
    public final mw7 b;
    public final bpb1 c;
    public final t4d1 d;
    public final bpb1 e;

    public jw7(ynb0 ynb0Var, mw7 mw7Var) {
        this.a = ynb0Var;
        this.b = mw7Var;
        bpb1 bpb1VarB = gio1.b(z6x.a);
        this.c = bpb1VarB;
        this.d = new t4d1(this, (byte) 20);
        this.e = bpb1VarB;
    }

    public static qi c(qt7 qt7Var) {
        cn70 cn70VarD;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && qt7Var.a().length() == 0) {
            CharSequence charSequenceB = qt7Var.b();
            qt7Var.getType();
            Objects.toString(charSequenceB);
            return null;
        }
        String string = qt7Var.b().toString();
        if (i >= 28) {
            cn70 cn70Var = cn70.b;
            cn70VarD = cua.d(ak.b, qt7Var.a());
        } else {
            cn70 cn70Var2 = cn70.b;
            cua.e();
            cn70VarD = cn70.b;
        }
        return new qi(string, null, null, 3, null, Boolean.TRUE, null, cn70VarD, 86);
    }

    public static boolean f(int i) {
        return i == 8 || i == 26 || i == 27;
    }

    @Override // p.zj
    public final void a() {
        uw7 uw7Var = (uw7) this.b;
        uw7Var.a.unregisterAudioDeviceCallback((AudioDeviceCallback) uw7Var.c.remove(this.d));
    }

    @Override // p.zj
    public final void b() {
        uw7 uw7Var = (uw7) this.b;
        t4d1 t4d1Var = this.d;
        AudioDeviceCallback tw7Var = new tw7(t4d1Var);
        uw7Var.c.put(t4d1Var, tw7Var);
        uw7Var.a.registerAudioDeviceCallback(tw7Var, null);
    }

    @Override // p.zj
    public final mr20 d() {
        return this.e;
    }

    public final qi e(qt7 qt7Var) {
        cn70 cn70VarD;
        String string = qt7Var.b().toString();
        String strU = j9k1.u((Context) this.a.get());
        if (Build.VERSION.SDK_INT >= 28) {
            cn70 cn70Var = cn70.b;
            cn70VarD = cua.d(ak.b, qt7Var.a());
        } else {
            cn70 cn70Var2 = cn70.b;
            cua.e();
            cn70VarD = cn70.b;
        }
        return new qi(string, strU, null, 4, null, Boolean.TRUE, null, cn70VarD, 84);
    }
}
