package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class te3 implements yt11 {
    public final aas a;
    public final fd3 b;
    public final b7r0 c;
    public final vu1 d;
    public final q8n e;
    public final elo f;
    public final g83 g;
    public final t740 h;
    public final opv0 i;
    public final vb2 j;
    public final boolean k;
    public final vgm l;
    public final s9d1 m;

    public te3(Context context, aas aasVar, fd3 fd3Var, b7r0 b7r0Var, vu1 vu1Var, ptk ptkVar, q8n q8nVar, elo eloVar, g83 g83Var, t740 t740Var, opv0 opv0Var, vb2 vb2Var, boolean z, vgm vgmVar) {
        this.a = aasVar;
        this.b = fd3Var;
        this.c = b7r0Var;
        this.d = vu1Var;
        this.e = q8nVar;
        this.f = eloVar;
        this.g = g83Var;
        this.h = t740Var;
        this.i = opv0Var;
        this.j = vb2Var;
        this.k = z;
        this.l = vgmVar;
        plm plmVar = new plm(context, 2132018135);
        int iO = ago1.o(new plm(context, 2132018135), 2130968831, 0);
        Drawable drawable = plmVar.getDrawable(2131231360);
        if (drawable != null) {
            drawable.setTint(ago1.o(plmVar, 2130968787, 0));
        } else {
            drawable = null;
        }
        drawable.getClass();
        vu11 vu11Var = new vu11(iO, new ads(drawable, (Drawable) null), new pe3(this, null, (byte) 0));
        pe3 pe3Var = new pe3(this, null, (byte) 2);
        Drawable drawable2 = plmVar.getDrawable(2131231566);
        if (drawable2 != null) {
            drawable2.setTint(ago1.o(plmVar, 2130968787, 0));
        } else {
            drawable2 = null;
        }
        drawable2.getClass();
        this.m = ptkVar.a ? new r9d1(new ks11(vjx.c, new pe3(this, null, (byte) 1)), new ks11(klx.c, new pe3(this, null, (byte) 3))) : new q9d1(vu11Var, new vu11(iO, new ads(drawable2, (Drawable) null), pe3Var));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        if (r15 == r1) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.unb1 r13, p.tv80 r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.te3.a(p.unb1, p.tv80, p.onm):java.lang.Object");
    }

    public final s9d1 b() {
        return this.m;
    }

    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        lnm lnmVar = null;
        jmb1 jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
        if (jmb1Var != null && tv80Var != null) {
            Object objY = fn31.Y(this.e, new hb1(this, jmb1Var, tv80Var, lnmVar, (byte) 12), onmVar);
            if (objY == d9n.a) {
                return objY;
            }
        }
        return rih1.a;
    }

    public final Object d(uv11 uv11Var, tv80 tv80Var, a8d1 a8d1Var) {
        ou80 ou80Var;
        String str;
        List listSingletonList = Collections.singletonList(ContextTrack.create(uv11Var.a));
        y6r0 y6r0Var = this.c.get();
        String str2 = y6r0Var != null ? y6r0Var.a : null;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (tv80Var != null && (ou80Var = tv80Var.a) != null && (str = ou80Var.a) != null) {
            str3 = str;
        }
        Object objI = fc11.i(this.a.a(2, str2, str3, listSingletonList).o(Functions.h), a8d1Var);
        return objI == d9n.a ? objI : rih1.a;
    }

    public final Object e(uv11 uv11Var, tv80 tv80Var, a8d1 a8d1Var) {
        String str = uv11Var.a;
        elo eloVar = this.f;
        boolean zContains = ((ijo) eloVar.b.getValue()).a.contains(str);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (zContains) {
            Object objY = fn31.Y(this.e, new hb1(this, uv11Var, tv80Var, null, (byte) 13), a8d1Var);
            return objY == d9nVar ? objY : rih1Var;
        }
        eloVar.b(uv11Var.a, tv80Var, a8d1Var);
        return rih1Var;
    }
}
