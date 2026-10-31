package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nwe extends auj {
    public final lpd Y1;
    public i8h1 a2;
    public z1p b2;
    public d1c c2;
    public boolean d2;
    public final dsk0 Z1 = k5p1.r();
    public boolean e2 = true;
    public final bpb1 f2 = gio1.b(Boolean.FALSE);

    public nwe(lpd lpdVar) {
        this.Y1 = lpdVar;
    }

    @Override // p.haa, p.zf30
    public final void I0(View view, Bundle bundle) {
        super.I0(view, bundle);
        p1().f(this.Z1.e(), (Set) null);
    }

    @Override // p.haa
    public final void k1(t4n t4nVar) {
        t4nVar.g().L(3);
    }

    @Override // p.haa
    public final void l1() {
        if (this.d2) {
            return;
        }
        p1().m(this.Z1.h(), (xj61) null);
    }

    @Override // p.auj
    public final void n1(xtj xtjVar, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1977350908);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            boolean zBooleanValue = ((Boolean) xto.j(this.f2, x340Var).getValue()).booleanValue();
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new lwe(this, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zI2 = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new mwe(this, (byte) 0);
                x340Var.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean zI3 = x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new mwe(this, (byte) 1);
                x340Var.s0(objT3);
            }
            rpo1.b(function0, iu30Var, (iu30) objT3, (qim0) null, zBooleanValue, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(this, xtjVar, i, (byte) 7);
        }
    }

    public final i8h1 p1() {
        i8h1 i8h1Var = this.a2;
        if (i8h1Var != null) {
            return i8h1Var;
        }
        u890.C("ubiLogger");
        throw null;
    }

    public final void q1(String str) {
        PackageManager packageManager;
        dg30 dg30VarF0;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        dg30 dg30VarF1 = f0();
        if (dg30VarF1 == null || (packageManager = dg30VarF1.getPackageManager()) == null || intent.resolveActivity(packageManager) == null || (dg30VarF0 = f0()) == null) {
            return;
        }
        dg30VarF0.startActivity(intent);
    }

    public final void r1(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        bpb1 bpb1Var = this.f2;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, boolValueOf);
    }

    @Override // p.t2u, p.zf30
    public final void v0(Context context) {
        this.Y1.f(this);
        super.v0(context);
    }
}
