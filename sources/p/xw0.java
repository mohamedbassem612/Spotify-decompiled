package p;

import android.content.ContentResolver;
import android.net.Uri;
import com.google.android.recaptcha.internal.zzhm;
import com.spotify.musicappplatform.state.idle.api.MusicAppLock;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xw0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(wo70 wo70Var, lnm lnmVar, MusicAppLock musicAppLock) {
        super(2, lnmVar);
        this.a = (byte) 6;
        this.b = wo70Var;
        this.c = musicAppLock;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                xw0 xw0Var = new xw0(obj2, lnmVar, (byte) 0);
                xw0Var.b = obj;
                return xw0Var;
            case 1:
                return new xw0((cir0) this.b, (iu30) obj2, lnmVar, (byte) 1);
            case 2:
                xw0 xw0Var2 = new xw0(obj2, lnmVar, (byte) 2);
                xw0Var2.b = obj;
                return xw0Var2;
            case 3:
                return new xw0((p7s) this.b, (w2z) obj2, lnmVar, (byte) 3);
            case 4:
                return new xw0((yfu) this.b, (Uri) obj2, lnmVar, (byte) 4);
            case 5:
                return new xw0((ymd0) this.b, (rjp0) obj2, lnmVar, (byte) 5);
            case 6:
                return new xw0((wo70) this.b, lnmVar, (MusicAppLock) obj2);
            case 7:
                xw0 xw0Var3 = new xw0(obj2, lnmVar, (byte) 7);
                xw0Var3.b = obj;
                return xw0Var3;
            case 8:
                return new xw0((p8r0) this.b, (ven0) obj2, lnmVar, (byte) 8);
            case 9:
                return new xw0((iiz0) this.b, (giz0) obj2, lnmVar, (byte) 9);
            case 10:
                return new xw0((vd01) this.b, (ven0) obj2, lnmVar, (byte) 10);
            case 11:
                xw0 xw0Var4 = new xw0(obj2, lnmVar, (byte) 11);
                xw0Var4.b = obj;
                return xw0Var4;
            case 12:
                xw0 xw0Var5 = new xw0(obj2, lnmVar, (byte) 12);
                xw0Var5.b = obj;
                return xw0Var5;
            case 13:
                return new xw0((v4g1) this.b, (gal) obj2, lnmVar, (byte) 13);
            case 14:
                return new xw0((oii1) this.b, (rqe1) obj2, lnmVar, (byte) 14);
            case 15:
                return new xw0((iqk1) this.b, (ArrayList) obj2, lnmVar, (byte) 15);
            case 16:
                return new xw0((iu30) this.b, (kes) obj2, lnmVar, (byte) 16);
            case 17:
                return new xw0((String) this.b, (gon0) obj2, lnmVar, (byte) 17);
            case 18:
                return new xw0((sln1) this.b, (u4o1) obj2, lnmVar, (byte) 18);
            case 19:
                return new xw0((cmn1) this.b, (u4o1) obj2, lnmVar, (byte) 19);
            default:
                return new xw0((xoo1) this.b, (String) obj2, lnmVar, (byte) 20);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public final Object invoke(Object obj, Object obj2) throws zzhm, IOException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((vw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                return create((Boolean) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((cen0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((uwz0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
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
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public final Object invokeSuspend(Object obj) throws zzhm, IOException {
        gia giaVar;
        String strX;
        byte[] bArrK = null;
        switch (this.a) {
            case 0:
                vw0 vw0Var = (vw0) this.b;
                hm5.M(obj);
                boolean z = vw0Var.a;
                boolean z2 = vw0Var.b;
                ip31 ip31Var = (ip31) this.c;
                if (z) {
                    ip31.l(ip31Var, z2);
                } else {
                    ip31.k(ip31Var, z2);
                }
                return rih1.a;
            case 1:
                hm5.M(obj);
                ((cir0) this.b).j(new yef((iu30) this.c, (byte) 0));
                return rih1.a;
            case 2:
                Boolean bool = (Boolean) this.b;
                hm5.M(obj);
                bool.getClass();
                return k2q.d(bool.booleanValue());
            case 3:
                hm5.M(obj);
                p7s p7sVar = (p7s) this.b;
                p7sVar.c().e(p7sVar.b((w2z) this.c, true));
                return rih1.a;
            case 4:
                hm5.M(obj);
                InputStream inputStreamOpenInputStream = ((ContentResolver) ((yfu) this.b).c).openInputStream((Uri) this.c);
                if (inputStreamOpenInputStream != null) {
                    try {
                        bArrK = o0c.K(inputStreamOpenInputStream);
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(inputStreamOpenInputStream, th);
                            throw th2;
                        }
                    }
                } else {
                    hhg1.n("Required value was null.");
                }
                return bArrK;
            case 5:
                hm5.M(obj);
                ((ymd0) this.b).k((rjp0) this.c);
                return rih1.a;
            case 6:
                hm5.M(obj);
                Iterator it = ((wo70) this.b).a.iterator();
                while (it.hasNext()) {
                    ((po70) it.next()).d((MusicAppLock) this.c);
                }
                return rih1.a;
            case 7:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                return k4k.m(c9nVar.J(), (Function0) this.c);
            case 8:
                hm5.M(obj);
                ((p8r0) this.b).f.c(wh.a((ven0) this.c));
                return rih1.a;
            case 9:
                hm5.M(obj);
                lzn0 lzn0Var = ((iiz0) this.b).g;
                p1f0 p1f0VarW = rrn1.w("spotify:quiz:results:challenge:completion:".concat(((giz0) this.c).a().a()));
                p1f0VarW.q(zvn0.a);
                p1f0VarW.x();
                lzn0Var.f(p1f0VarW.h());
                return rih1.a;
            case 10:
                hm5.M(obj);
                if (f2z0.a((ven0) this.c)) {
                    vd01 vd01Var = (vd01) this.b;
                    sfz.b(vd01Var.f124p, vd01Var.c.a());
                }
                return rih1.a;
            case 11:
                c9n c9nVar2 = (c9n) this.b;
                hm5.M(obj);
                vu01 vu01Var = (vu01) this.c;
                vu01.l(vu01Var).b(vu01.p(vu01Var), vu01.k(vu01Var));
                if (!vu01.m(vu01Var) && !vu01.o(vu01Var) && vu01.n(vu01Var).a() != null) {
                    vu01.l(vu01Var).a(new rs01(vu01.s(vu01.n(vu01Var).a())));
                    vu01.r(vu01Var);
                }
                Integer numB = vu01.n(vu01Var).b();
                if (!vu01.m(vu01Var) && numB != null && numB.intValue() > 0) {
                    vu01.q(vu01Var, yah0.p(Math.min(numB.intValue(), 10)));
                }
                if (!vu01.m(vu01Var)) {
                    c921.y(c9nVar2, (o8n) null, 0, new ic01(vu01Var, (lnm) null, (byte) 5), 3);
                }
                return rih1.a;
            case 12:
                hm5.M(obj);
                cen0 cen0Var = (cen0) this.b;
                mnv0 mnv0Var = ld61.a;
                cen0Var.a(ld61.a, (String) this.c);
                return rih1.a;
            case 13:
                hm5.M(obj);
                v4g1 v4g1Var = (v4g1) this.b;
                Set setC = ((gal) this.c).c();
                if (setC == null) {
                    giaVar = gia.c;
                } else {
                    giaVar = setC.contains(a7o0.b) ? gia.a : gia.b;
                }
                v4g1Var.h = giaVar;
                return rih1.a;
            case 14:
                hm5.M(obj);
                iii1 iii1Var = ((oii1) this.b).d;
                rqe1 rqe1Var = (rqe1) this.c;
                rqe1Var.getClass();
                iii1Var.a(rqe1Var);
                return rih1.a;
            case 15:
                hm5.M(obj);
                iqk1 iqk1Var = (iqk1) this.b;
                iqk1Var.l(new jqk1((ArrayList) this.c));
                iqk1.k(iqk1Var);
                return rih1.a;
            case 16:
                hm5.M(obj);
                ((iu30) this.b).invoke(new wxk1(((kes) this.c).d.p()));
                return rih1.a;
            case 17:
                hm5.M(obj);
                if (u890.j((String) this.b, "lyrics")) {
                    gon0.s((gon0) this.c, jkm1.INSTANCE);
                }
                return rih1.a;
            case 18:
                hm5.M(obj);
                sln1 sln1Var = (sln1) this.b;
                if (sln1Var == null || (strX = sln1Var.x()) == null) {
                    strX = "";
                }
                u4o1 u4o1Var = (u4o1) this.c;
                rnn1 rnn1VarY = unn1.y();
                snn1 snn1VarX = tnn1.x();
                snn1VarX.j(strX);
                rnn1VarY.i(k4p1.x(snn1VarX.e()));
                return bmq0.l0(u4o1Var, rnn1VarY.e());
            case 19:
                hm5.M(obj);
                if (((cmn1) this.b).y().length() != 0) {
                    return rih1.a;
                }
                ((u4o1) this.c).a = false;
                throw new zzhm(tgo1.c, ij81.X0, (String) null, (Exception) null);
            default:
                hm5.M(obj);
                xoo1 xoo1Var = (xoo1) this.b;
                if (u890.j(xoo1Var.b(), (String) this.c)) {
                    return xoo1Var;
                }
                throw new zzhm(tgo1.e, ij81.a1, (String) null, (Exception) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
