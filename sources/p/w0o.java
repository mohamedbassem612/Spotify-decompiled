package p;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w0o implements o1i {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public w0o(Activity activity, lzn0 lzn0Var, bcl1 bcl1Var) {
        this.a = (byte) 2;
        this.b = lzn0Var;
        this.c = bcl1Var;
        View viewInflate = LayoutInflater.from(activity).inflate(2131626171, (ViewGroup) null, false);
        int i = 2131431016;
        TextView textView = (TextView) m5n1.t(viewInflate, 2131431016);
        if (textView != null) {
            i = 2131431019;
            TextView textView2 = (TextView) m5n1.t(viewInflate, 2131431019);
            if (textView2 != null) {
                this.d = new r961((LinearLayout) viewInflate, textView, textView2, (byte) 29);
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((t0o) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 1:
                d((ot70) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 2:
                e((wt91) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                f((vtf1) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        switch (this.a) {
            case 0:
                return new x0i(new w0i(o0iVar.e, "creator_follow_row", ((t0o) z0iVar).a, null, 8));
            case 1:
                return new x0i(new w0i(o0iVar.e, "image_header_body", ((ot70) z0iVar).c, null, 8));
            case 2:
                return new x0i(new w0i(o0iVar.e, "snackbar_message", null, null, 12));
            default:
                return new x0i(new w0i(o0iVar.e, "track_preview_content", ((vtf1) z0iVar).a, null, 8));
        }
    }

    public void c(t0o t0oVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(597655880);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(t0oVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            sp00 sp00Var = (sp00) this.d;
            String str = t0oVar.a;
            ven0 ven0VarG = rwq.g(yoi1.g(g7h.d((g7h) sp00Var.b, "", new String[]{str}).map(new xrh(str, (byte) 1)).onErrorComplete().distinctUntilChanged().observeOn((Scheduler) sp00Var.e)), Boolean.FALSE, (o8n) null, x340Var, 48, 2);
            boolean zBooleanValue = ((Boolean) ven0VarG.getValue()).booleanValue();
            int i3 = i2 & 112;
            boolean zG = x340Var.g(ven0VarG) | x340Var.i(this) | (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar)));
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new m3n(this, o0iVar, ven0VarG, (byte) 2);
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean zI = x340Var.i(this);
            if (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) {
                z = true;
            }
            boolean z2 = zI | z;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new kjk(this, o0iVar, (byte) 28);
                x340Var.s0(objT2);
            }
            ero1.b(t0oVar, zBooleanValue, iu30Var, (iu30) objT2, uyn1.z(0.0f, 4.0f, 1, qim0Var), x340Var, i2 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(this, t0oVar, o0iVar, qim0Var, i, (byte) 23);
        }
    }

    public void d(ot70 ot70Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1191541722);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(ot70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(o0iVar) : b0kVar3.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float fM0 = ((wat) b0kVar3.k(t4k.h)).M0(((Rect) ((q9l1) this.d).h.d.e).width());
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new zi50(ot70Var, (byte) 25);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarZ = uyn1.z(fM0, 0.0f, 2, s161.b(qim0Var, true, (iu30) objT));
            int i4 = i2;
            gra graVar = een.h;
            kgx kgxVar = new kgx(0, (vu30) null, (vu30) null, (vu30) null, 15);
            boolean zI = (i3 == 4) | b0kVar3.i(this) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && b0kVar3.i(o0iVar)));
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new xvy(this, ot70Var, o0iVar);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarZ, graVar, (hw61) null, kgxVar, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT2), (gbx) null, apo.r(1980296593, new gn50(ot70Var, (byte) 19), b0kVar3), b0kVar2, 100663344, 48, 1268);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, this, ot70Var, o0iVar, qim0Var, (byte) 16);
        }
    }

    public void e(wt91 wt91Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-676324959);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(wt91Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new d781(this, (byte) 29);
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean zI2 = ((i2 & 14) == 4) | x340Var.i(this);
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) {
                z = true;
            }
            boolean z2 = zI2 | z;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ny51(this, wt91Var, o0iVar, (byte) 14);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var, qim0Var2, (iu30) objT2, x340Var, (i2 >> 3) & 112, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, this, wt91Var, o0iVar, qim0Var, (byte) 19);
        }
    }

    public void f(vtf1 vtf1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        vtf1 vtf1Var2;
        int i3;
        w0o w0oVar = this;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1601972666);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(vtf1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar2.g(o0iVar) : b0kVar2.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(w0oVar) ? 2048 : 1024;
        }
        int i4 = i2;
        if (b0kVar2.Y(i4 & 1, (i4 & 1171) != 1170)) {
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object objT = b0kVar2.T();
            if (z || objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                b0kVar2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z2 = i5 == 4;
            Object objT2 = b0kVar2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                b0kVar2.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            boolean z3 = i5 == 4;
            Object objT3 = b0kVar2.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar2.s0(objT3);
            }
            ven0 ven0Var3 = (ven0) objT3;
            acq0.y(vtf1Var, ((Boolean) ven0Var.getValue()).booleanValue(), ((Boolean) ven0Var2.getValue()).booleanValue(), ((Boolean) ven0Var3.getValue()).booleanValue(), qim0Var, b0kVar2, i5 | ((i4 << 6) & 57344));
            vtf1Var2 = vtf1Var;
            boolean zG = b0kVar2.g(ven0Var2) | b0kVar2.i(w0oVar) | b0kVar2.g(ven0Var) | b0kVar2.g(ven0Var3);
            Object objT4 = b0kVar2.T();
            if (zG || objT4 == m4cVar) {
                i3 = i5;
                e971 e971Var = new e971(w0oVar, ven0Var2, ven0Var, ven0Var3, (byte) 21);
                b0kVar2.s0(e971Var);
                objT4 = e971Var;
            } else {
                i3 = i5;
            }
            int i6 = i4 & 112;
            oto1.c(vtf1Var2, o0iVar, (iu30) objT4, b0kVar2, i3 | 64 | i6);
            boolean z4 = i3 == 4;
            Object objT5 = b0kVar2.T();
            if (z4 || objT5 == m4cVar) {
                ny7 ny7Var = new ny7(vtf1Var2.b, vtf1Var2.a, vtf1Var2.h, vtf1Var2.e, vtf1Var2.f ? 5 : null, null, 96);
                b0kVar2.s0(ny7Var);
                objT5 = ny7Var;
            }
            b0kVar2 = b0kVar2;
            sto1.a((wdm) w0oVar.b, o0iVar, (ny7) objT5, (Function0) null, b0kVar2, 64 | i6, 8);
        } else {
            w0oVar = w0oVar;
            vtf1Var2 = vtf1Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, w0oVar, vtf1Var2, o0iVar, qim0Var, (byte) 7);
        }
    }

    public /* synthetic */ w0o(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public w0o(q9l1 q9l1Var, lzn0 lzn0Var, bcl1 bcl1Var) {
        this.a = (byte) 1;
        this.d = q9l1Var;
        this.b = lzn0Var;
        this.c = bcl1Var;
    }
}
