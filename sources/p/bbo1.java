package p;

import android.app.Application;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bbo1 implements xbo1 {
    public final i25 a;

    public bbo1(i25 i25Var) {
        this.a = i25Var;
    }

    @Override // p.xbo1
    public final Object zza(Object... objArr) {
        int iIntValue = ((Integer) objArr[0]).intValue();
        long jIntValue = ((Integer) objArr[1]).intValue();
        i25 i25Var = this.a;
        if (i25Var.a) {
            return null;
        }
        if (((bpn1) i25Var.e) == null) {
            i25Var.e = new bpn1(((Application) i25Var.b).getApplicationContext(), iIntValue, jIntValue);
        }
        i25Var.a = true;
        ((utw0) i25Var.d).a = new ct91(i25Var, (byte) 1);
        return null;
    }

    @Override // p.xbo1
    public /* bridge */ /* synthetic */ Object zzb(Object[] objArr) {
        return super.zzb(objArr);
    }
}
