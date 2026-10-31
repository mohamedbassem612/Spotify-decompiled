package p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.scrollsita.v1.Section;
import j$.net.URLEncoder;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vbc1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vbc1(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new vbc1((wbc1) obj2, lnmVar, (byte) 0);
            case 1:
                return new vbc1((hp91) obj2, lnmVar, (byte) 1);
            case 2:
                return new vbc1((ve8) obj2, lnmVar, (byte) 2);
            case 3:
                return new vbc1((x0e1) obj2, lnmVar, (byte) 3);
            case 4:
                return new vbc1((ce6) obj2, lnmVar, (byte) 4);
            case 5:
                return new vbc1((naf1) obj2, lnmVar, (byte) 5);
            case 6:
                return new vbc1((sa90) obj2, lnmVar, (byte) 6);
            case 7:
                return new vbc1((ve8) obj2, lnmVar, (byte) 7);
            case 8:
                return new vbc1((hce1) obj2, lnmVar, (byte) 8);
            case 9:
                return new vbc1((wuf1) obj2, lnmVar, (byte) 9);
            case 10:
                return new vbc1((b0i0) obj2, lnmVar, (byte) 10);
            case 11:
                return new vbc1((rb3) obj2, lnmVar, (byte) 11);
            case 12:
                return new vbc1((apz0) obj2, lnmVar, (byte) 12);
            case 13:
                return new vbc1((npg1) obj2, lnmVar, (byte) 13);
            case 14:
                return new vbc1((kxg1) obj2, lnmVar, (byte) 14);
            case 15:
                return new vbc1((orh1) obj2, lnmVar, (byte) 15);
            case 16:
                return new vbc1((pyh1) obj2, lnmVar, (byte) 16);
            case 17:
                return new vbc1((kzi1) obj2, lnmVar, (byte) 17);
            case 18:
                return new vbc1((l0j1) obj2, lnmVar, (byte) 18);
            case 19:
                return new vbc1((v3t0) obj2, lnmVar, (byte) 19);
            case 20:
                return new vbc1((r0k1) obj2, lnmVar, (byte) 20);
            case 21:
                return new vbc1((khk1) obj2, lnmVar, (byte) 21);
            case 22:
                return new vbc1((fyc) obj2, lnmVar, (byte) 22);
            case 23:
                return new vbc1((x9l1) obj2, lnmVar, (byte) 23);
            case 24:
                return new vbc1((cll1) obj2, lnmVar, (byte) 24);
            case 25:
                return new vbc1((l8m1) obj2, lnmVar, (byte) 25);
            case 26:
                return new vbc1((bih1) obj2, lnmVar, (byte) 26);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new vbc1((ghm1) obj2, lnmVar, (byte) 27);
            case 28:
                return new vbc1((yzm1) obj2, lnmVar, (byte) 28);
            default:
                return new vbc1((j0n1) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hm5.M(obj);
                mv2 mv2Var = ((wbc1) this.b).c;
                xab1 xab1Var = (xab1) mv2Var.h;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                mv2Var.h = null;
                return rih1.a;
            case 1:
                hm5.M(obj);
                a1r0.j((a1r0) ((hp91) this.b).b, "spotify:internal:ads:preferred-ad-categories", (String) null, (Bundle) null, false, 14);
                return rih1.a;
            case 2:
                hm5.M(obj);
                ((zqe) ((ve8) this.b).c).invoke();
                return rih1.a;
            case 3:
                hm5.M(obj);
                ((x0e1) this.b).invoke();
                return rih1.a;
            case 4:
                hm5.M(obj);
                ((nda1) ((ce6) this.b).e).invoke();
                return rih1.a;
            case 5:
                hm5.M(obj);
                ((Function0) ((naf1) this.b).e).invoke();
                return rih1.a;
            case 6:
                hm5.M(obj);
                ((nda1) ((sa90) this.b).e).invoke();
                return rih1.a;
            case 7:
                hm5.M(obj);
                ((nda1) ((ve8) this.b).d).invoke();
                return rih1.a;
            case 8:
                hm5.M(obj);
                return ((kly0) ((hce1) this.b).b).get();
            case 9:
                hm5.M(obj);
                String strEncode = URLEncoder.encode("content_windowing:early_access_after_release", "UTF-8");
                wuf1 wuf1Var = (wuf1) this.b;
                wuf1Var.b.f(new dwn0(nik1.b2 + "?displayReason=" + strEncode, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                wuf1Var.a.a(ixb.c);
                return rih1.a;
            case 10:
                hm5.M(obj);
                b0i0 b0i0Var = (b0i0) this.b;
                synchronized (b0i0Var.e) {
                    try {
                        long jB = ((yqg) b0i0Var.c).b();
                        for (List list : b0i0Var.j(jB, (jB - b0i0Var.a) + 30000)) {
                            Logger.b(o7h.y0(list, "\n", "Unterminated sequence detected:\n", (String) null, (iu30) null, 60), new Object[0]);
                            n57.v(new IllegalStateException("Possibly unterminated events(" + list.size() + ") detected, check logs for more details"));
                        }
                        b0i0Var.a = ((yqg) b0i0Var.c).b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return rih1.a;
            case 11:
                hm5.M(obj);
                vnd1 vnd1Var = (vnd1) ((rb3) this.b).d;
                i8h1 i8h1Var = (i8h1) vnd1Var.b;
                brl0 brl0Var = (brl0) vnd1Var.c;
                x6h1 x6h1VarC = brl0Var.b.c();
                x6h1VarC.i.add(new a7h1("description_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = brl0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1.a;
            case 12:
                hm5.M(obj);
                vnd1 vnd1Var2 = (vnd1) ((apz0) this.b).e;
                i8h1 i8h1Var2 = (i8h1) vnd1Var2.b;
                brl0 brl0Var2 = (brl0) vnd1Var2.c;
                x6h1 x6h1VarC2 = brl0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("header_metadata", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = brl0Var2.c;
                i8h1Var2.f(k7h1Var2.a(), (Set) null);
                return rih1.a;
            case 13:
                hm5.M(obj);
                ((npg1) this.b).e.e();
                return rih1.a;
            case 14:
                hm5.M(obj);
                return ((kxg1) this.b).d.c();
            case 15:
                hm5.M(obj);
                orh1 orh1Var = (orh1) this.b;
                orh1Var.b.k(new er91((fs91) null, orh1Var.c.getString(2131963519), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1.a;
            case 16:
                hm5.M(obj);
                ((pyh1) this.b).a.a(ixb.c);
                return rih1.a;
            case 17:
                hm5.M(obj);
                ((kzi1) this.b).c.e();
                return rih1.a;
            case 18:
                hm5.M(obj);
                ((l0j1) this.b).c.e();
                return rih1.a;
            case 19:
                hm5.M(obj);
                r091 r091Var = ((h4t0) ((v3t0) this.b).b.getValue()).c;
                if (r091Var != null) {
                    r091Var.j();
                }
                return rih1.a;
            case 20:
                hm5.M(obj);
                r0k1 r0k1Var = (r0k1) this.b;
                r0k1Var.b.k(new er91((fs91) null, r0k1Var.c.getString(2131963796), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1.a;
            case 21:
                hm5.M(obj);
                khk1 khk1Var = (khk1) this.b;
                jhk1 jhk1Var = khk1Var.d;
                if (jhk1Var != null) {
                    jhk1Var.d();
                }
                khk1Var.d = null;
                return rih1.a;
            case 22:
                hm5.M(obj);
                mv2 mv2Var2 = (mv2) ((fyc) this.b).b;
                xab1 xab1Var2 = (xab1) mv2Var2.h;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                mv2Var2.h = null;
                return rih1.a;
            case 23:
                hm5.M(obj);
                mv2 mv2Var3 = ((x9l1) this.b).e;
                xab1 xab1Var3 = (xab1) mv2Var3.h;
                if (xab1Var3 != null) {
                    xab1Var3.d((CancellationException) null);
                }
                mv2Var3.h = null;
                return rih1.a;
            case 24:
                hm5.M(obj);
                ((cll1) this.b).d.a();
                return rih1.a;
            case 25:
                hm5.M(obj);
                ((l8m1) this.b).c.a(igm1.a);
                return rih1.a;
            case 26:
                hm5.M(obj);
                ((bih1) this.b).k();
                return rih1.a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                hm5.M(obj);
                Intent intent = ((ghm1) this.b).a;
                intent.putExtra("com.spotify.wrapped.sharing.HANDLED_LINK", intent.getDataString());
                return rih1.a;
            case 28:
                hm5.M(obj);
                yzm1 yzm1Var = (yzm1) this.b;
                if (!yzm1Var.f) {
                    yzm1Var.f = true;
                    if (((Boolean) yzm1Var.e.getValue()).booleanValue()) {
                        yzm1Var.d.c();
                    }
                    u911 u911Var = yzm1Var.b;
                    if (u911Var != null) {
                        i8h1 i8h1Var3 = u911Var.a;
                        i8h1Var3.f(((wtl0) u911Var.f.getValue()).e(), (Set) null);
                        if (u911Var.c.b()) {
                            i8h1Var3.f(((xtl0) u911Var.i.getValue()).e(), (Set) null);
                        }
                    }
                }
                return rih1.a;
            default:
                hm5.M(obj);
                j0n1 j0n1Var = (j0n1) this.b;
                j0n1Var.c.a(j0n1Var.a.d().subscribe(new rdj1(j0n1Var, (byte) 20), vrk1.Y));
                return rih1.a;
        }
    }
}
