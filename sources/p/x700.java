package p;

import android.os.Bundle;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x700 implements h8l {
    public final /* synthetic */ byte a = 1;
    public final Object b;

    public x700(uny unyVar) {
        this.b = unyVar;
        rwq0.s(((u800) unyVar.c).b(), gft.a1);
    }

    public static final /* synthetic */ spz0 b(x700 x700Var) {
        return (spz0) x700Var.b;
    }

    public final Connection L(Consumer consumer) {
        switch (this.a) {
            case 0:
                xu2 xu2Var = new xu2(consumer, (byte) 8);
                ((uny) this.b).d(ps4.Y, xu2Var);
                return new cn(this, xu2Var, (byte) 21);
            default:
                return new otj(this, (byte) 1);
        }
    }

    public final Object getView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((u800) ((uny) obj).c).b();
            default:
                return ((spz0) obj).b.e();
        }
    }

    public final Bundle serialize() {
        switch (this.a) {
            case 0:
                break;
        }
        return mno1.g();
    }

    public final void start() {
        byte b = this.a;
    }

    public final void stop() {
        byte b = this.a;
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    public x700(spz0 spz0Var) {
        this.b = spz0Var;
    }
}
