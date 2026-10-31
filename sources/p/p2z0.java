package p;

import android.R;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.corex.reading.proto.ReadSpan;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p2z0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2z0(m2z0 m2z0Var, x2z0 x2z0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.c = m2z0Var;
        this.b = x2z0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new p2z0((x2z0) this.b, (l2z0) obj2, lnmVar, (byte) 0);
            case 1:
                return new p2z0((m2z0) obj2, (x2z0) this.b, lnmVar);
            case 2:
                return new p2z0((ydz0) this.b, (jh9) obj2, lnmVar, (byte) 2);
            case 3:
                p2z0 p2z0Var = new p2z0(obj2, lnmVar, (byte) 3);
                p2z0Var.b = obj;
                return p2z0Var;
            case 4:
                return new p2z0((fgz0) this.b, (ven0) obj2, lnmVar, (byte) 4);
            case 5:
                return new p2z0((kdy0) this.b, (String) obj2, lnmVar, (byte) 5);
            case 6:
                return new p2z0((bjx) this.b, (String) obj2, lnmVar, (byte) 6);
            case 7:
                return new p2z0((obl1) this.b, (j701) obj2, lnmVar, (byte) 7);
            case 8:
                return new p2z0((ezj) this.b, (i2c) obj2, lnmVar, (byte) 8);
            case 9:
                p2z0 p2z0Var2 = new p2z0(obj2, lnmVar, (byte) 9);
                p2z0Var2.b = obj;
                return p2z0Var2;
            case 10:
                return new p2z0((ed01) this.b, (ln21) obj2, lnmVar, (byte) 10);
            case 11:
                return new p2z0((fd01) this.b, (hd01) obj2, lnmVar, (byte) 11);
            case 12:
                p2z0 p2z0Var3 = new p2z0(obj2, lnmVar, (byte) 12);
                p2z0Var3.b = obj;
                return p2z0Var3;
            case 13:
                return new p2z0((zen0) this.b, (b511) obj2, lnmVar, (byte) 13);
            case 14:
                p2z0 p2z0Var4 = new p2z0(obj2, lnmVar, (byte) 14);
                p2z0Var4.b = obj;
                return p2z0Var4;
            case 15:
                p2z0 p2z0Var5 = new p2z0(obj2, lnmVar, (byte) 15);
                p2z0Var5.b = obj;
                return p2z0Var5;
            case 16:
                p2z0 p2z0Var6 = new p2z0(obj2, lnmVar, (byte) 16);
                p2z0Var6.b = obj;
                return p2z0Var6;
            case 17:
                return new p2z0((b921) this.b, (i8h1) obj2, lnmVar, (byte) 17);
            case 18:
                return new p2z0((Boolean) this.b, (Function0) obj2, lnmVar, (byte) 18);
            case 19:
                return new p2z0((iu30) this.b, (Throwable) obj2, lnmVar, (byte) 19);
            case 20:
                return new p2z0((jj31) this.b, (Throwable) obj2, lnmVar, (byte) 20);
            case 21:
                return new p2z0((y0i) this.b, (n1i) obj2, lnmVar, (byte) 21);
            case 22:
                return new p2z0((bo31) this.b, (rn3) obj2, lnmVar, (byte) 22);
            case 23:
                p2z0 p2z0Var7 = new p2z0(obj2, lnmVar, (byte) 23);
                p2z0Var7.b = obj;
                return p2z0Var7;
            case 24:
                return new p2z0((f741) this.b, (Context) obj2, lnmVar, (byte) 24);
            case 25:
                p2z0 p2z0Var8 = new p2z0(obj2, lnmVar, (byte) 25);
                p2z0Var8.b = obj;
                return p2z0Var8;
            case 26:
                return new p2z0((ec5) this.b, (cb80) obj2, lnmVar, (byte) 26);
            case 27:
                return new p2z0((al41) this.b, (jl41) obj2, lnmVar, (byte) 27);
            case 28:
                return new p2z0((jl41) this.b, (er91) obj2, lnmVar, (byte) 28);
            default:
                return new p2z0((qn41) this.b, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
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
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((jh9) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                throw null;
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                return create((trm) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                create((t5l) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:62:0x018e  */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List m231Var;
        boolean z;
        boolean z2;
        String string;
        switch (this.a) {
            case 0:
                hm5.M(obj);
                x2z0 x2z0Var = (x2z0) this.b;
                mfm mfmVarA = x2z0Var.b.a(x2z0Var.e);
                k811 k811Var = x2z0Var.c;
                kjm kjmVar = new kjm(new igm(((Context) k811Var.b).getString(2131959011), (rzn1) null, (String) null, 6), Collections.singletonList(jl21.b((jl21) k811Var.d, ((l2z0) this.c).a, (lik1) k811Var.c)), 4);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.c(mfmVarA, kjmVar, yon1.d1(), (bjm) null, (tv80) null, 20);
                return rih1.a;
            case 1:
                x2z0 x2z0Var2 = (x2z0) this.b;
                hm5.M(obj);
                int i = ((m2z0) this.c).a;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                kt91 kt91Var = x2z0Var2.d;
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                } else {
                    kt91Var.o(er91Var);
                }
                return rih1.a;
            case 2:
                hm5.M(obj);
                ((ydz0) this.b).a.c((jh9) this.c);
                return rih1.a;
            case 3:
                jh9 jh9Var = (jh9) this.b;
                hm5.M(obj);
                ((ydz0) this.c).e(new tdz0(jh9Var));
                return rih1.a;
            case 4:
                hm5.M(obj);
                if (((fgz0) this.b).b()) {
                    ven0 ven0Var = (ven0) this.c;
                    float f = zfz0.c;
                    ven0Var.setValue(Boolean.TRUE);
                }
                return rih1.a;
            case 5:
                hm5.M(obj);
                ((b431) ((kdy0) this.b).b).a(new sjz0((String) this.c), (String) null);
                return rih1.a;
            case 6:
                hm5.M(obj);
                ((b431) ((bjx) this.b).g).a(new frz0((String) this.c, u0a.a, "other", null), (String) null);
                return rih1.a;
            case 7:
                hm5.M(obj);
                ((obl1) this.b).a(((j701) this.c).a.a);
                return rih1.a;
            case 8:
                hm5.M(obj);
                ezj ezjVar = (ezj) this.b;
                long j = ((i2c) this.c).b;
                if (hjl.e(j)) {
                    ezjVar.d.onNext(new oeg1(Integer.MAX_VALUE, new azj(ezjVar.a, ezjVar.b, j, ezjVar.c)));
                } else {
                    ezjVar.getClass();
                }
                return rih1.a;
            case 9:
                mmr0 mmr0Var = (mmr0) this.b;
                hm5.M(obj);
                if (mmr0Var.b == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
            case 10:
                hm5.M(obj);
                ry21 ry21VarE = ((ed01) this.b).b.d.c().a((ln21) this.c).e();
                try {
                    if (ry21VarE.Q0) {
                        ReadSpan readSpanT = ReadSpan.t(ry21VarE.g.c());
                        ry21VarE.close();
                        return readSpanT;
                    }
                    throw new IOException("Page fetch failed: " + ry21VarE.d);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(ry21VarE, th);
                        throw th2;
                    }
                }
            case 11:
                rih1 rih1Var = rih1.a;
                hd01 hd01Var = (hd01) this.c;
                fd01 fd01Var = (fd01) this.b;
                hm5.M(obj);
                try {
                    ne neVar = new ne((byte) 9);
                    neVar.t();
                    neVar.e0(fd01Var.b);
                    ry21 ry21VarE2 = hd01Var.b.a(new ln21(neVar)).e();
                    try {
                        if (ry21VarE2.Q0) {
                            byte[] bArrC = ry21VarE2.g.c();
                            File file = new File(new File(hd01Var.a, "EReaderFonts"), fd01Var.c);
                            File parentFile = file.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            y520.J(file, bArrC);
                            hd01Var.b(fd01Var, file);
                        }
                        ry21VarE2.close();
                        break;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            u890.p(ry21VarE2, th3);
                            throw th4;
                        }
                    }
                } catch (Exception unused) {
                }
                return rih1Var;
            case 12:
                hm5.M(obj);
                try {
                    m231Var = cm01.c(((dma1) ((cm01) this.c).a.get()).e(cm01.c, (String) null));
                    break;
                } catch (Throwable th5) {
                    m231Var = new m231(th5);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    if (thA instanceof CancellationException) {
                        throw thA;
                    }
                    Logger.e(thA, "Failed to get recent emoji list", new Object[0]);
                }
                return m231Var instanceof m231 ? z6x.a : m231Var;
            case 13:
                hm5.M(obj);
                ((zen0) this.b).w1(Boolean.valueOf(((b511) this.c).b));
                return rih1.a;
            case 14:
                trm trmVar = (trm) this.b;
                hm5.M(obj);
                z911 z911Var = (z911) this.c;
                synchronized (z911Var.c) {
                    if (z911Var.e) {
                        return rih1.a;
                    }
                    Set set = (Set) z911Var.b.invoke(trmVar, z911Var.d);
                    if (!set.isEmpty()) {
                        z911Var.a.b(set);
                        z911Var.a.a(z911Var.d);
                    }
                    return rih1.a;
                }
            case 15:
                t5l t5lVar = (t5l) this.b;
                hm5.M(obj);
                u5l u5lVar = ((hi11) this.c).e;
                String str = t5lVar.f;
                hma1 hma1VarEdit = u5lVar.a.edit();
                hma1VarEdit.d(u5l.b, str);
                hma1VarEdit.g();
                return rih1.a;
            case 16:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                j421 j421Var = (j421) this.c;
                fn31.T(c9nVar, (o8n) null, 0, new i421(j421Var, (lnm) null, (byte) 0), 3);
                fn31.T(c9nVar, (o8n) null, 0, new i421(j421Var, (lnm) null, (byte) 1), 3);
                return rih1.a;
            case 17:
                hm5.M(obj);
                xul0 xul0Var = ((b921) this.b).b;
                if (xul0Var != null) {
                    i8h1 i8h1Var = (i8h1) this.c;
                    x6h1 x6h1VarC = xul0Var.b.c();
                    x6h1VarC.i.add(new a7h1("confirm_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = xul0Var.a;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                }
                return rih1.a;
            case 18:
                hm5.M(obj);
                if (u890.j((Boolean) this.b, Boolean.FALSE)) {
                    ((Function0) this.c).invoke();
                }
                return rih1.a;
            case 19:
                hm5.M(obj);
                ((iu30) this.b).invoke((Throwable) this.c);
                return rih1.a;
            case 20:
                hm5.M(obj);
                ((jj31) this.b).l.invoke((Throwable) this.c);
                return rih1.a;
            case 21:
                hm5.M(obj);
                y0i y0iVar = (y0i) this.b;
                n1i n1iVar = (n1i) this.c;
                y0iVar.e = n1iVar;
                z0i z0iVar = y0iVar.d;
                if (z0iVar != null) {
                    LinkedHashMap linkedHashMap = y0iVar.c;
                    Object objA = linkedHashMap.get(z0iVar);
                    if (objA == null) {
                        objA = y0iVar.a.a(y0iVar.b, (z0i) null, (n2u0) null);
                        linkedHashMap.put(z0iVar, objA);
                    }
                    ((xm90) objA).a(n1iVar);
                }
                return rih1.a;
            case 22:
                hm5.M(obj);
                ir91 ir91Var = ((bo31) this.b).h;
                rn3 rn3Var = (rn3) this.c;
                ir91Var.a(new ko3(rn3Var.e, rn3Var.d));
                return rih1.a;
            case 23:
                hm5.M(obj);
                q8n q8nVarA = ((c9n) this.b).J().A(wdu0.Y);
                q8nVarA.getClass();
                q8n q8nVar = q8nVarA;
                ayh ayhVarA = sap1.a();
                fn31.S(ov40.a, q8nVar, 4, new m311(ayhVarA, (vu30) this.c, (lnm) null, (byte) 27));
                while (!ayhVarA.v()) {
                    try {
                        return jo31.t(q8nVar, new lhb(ayhVarA, (lnm) null, (byte) 5));
                    } catch (InterruptedException unused2) {
                    }
                }
                return ayhVarA.Z();
            case 24:
                Context context = (Context) this.c;
                hm5.M(obj);
                if (Build.VERSION.SDK_INT <= 30) {
                    z2 = !(AccountManager.get(context).getAccountsByType("com.osp.app.signin").length == 0);
                } else {
                    String str2 = "";
                    try {
                        Bundle bundle = context.getPackageManager().getApplicationInfo("com.osp.app.signin", 128).metaData;
                        if ((bundle != null ? bundle.getFloat("AccountManagerProvider", 0.0f) : 0.0f) > 0.0f) {
                            Bundle bundleCall = context.getContentResolver().call(Uri.parse("content://com.samsung.android.samsungaccount.accountmanagerprovider"), "getSamsungAccountId", "q3voa1im9e", (Bundle) null);
                            int i2 = bundleCall != null ? bundleCall.getInt("result_code", 1) : 1;
                            if (bundleCall != null && (string = bundleCall.getString("result_message", "")) != null) {
                                str2 = string;
                            }
                            z = i2 == 0 && str2.length() > 0;
                        }
                    } catch (PackageManager.NameNotFoundException | Exception unused3) {
                    }
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            case 25:
                c9n c9nVar2 = (c9n) this.b;
                hm5.M(obj);
                q741 q741Var = (q741) this.c;
                fn31.T(c9nVar2, (o8n) null, 0, new ic01(q741Var, (lnm) null, (byte) 21), 3);
                gj5 gj5Var = q741Var.d;
                if (((f0i) gj5Var).a.i.a(w8c0.e)) {
                    q741Var.f.k();
                    kt91 kt91Var2 = q741Var.g;
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961400});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var2.n(new er91((fs91) null, "", 2131961400, q741Var.h.getString(2131961401), (Integer) null, new hid0(q741Var, (byte) 25), (cvr) null, (xq91) null, false), gj5Var.findViewById(R.id.content));
                }
                return rih1.a;
            case 26:
                hm5.M(obj);
                float fFloatValue = ((Number) ((cb80) this.c).d.getValue()).floatValue() / 360.0f;
                ec5 ec5Var = (ec5) this.b;
                float f2 = (0.5f + fFloatValue) % 1.0f;
                Handler handler = ec5Var.f;
                if (handler != null) {
                    handler.post(new dc5(ec5Var, fFloatValue, f2));
                }
                return rih1.a;
            case 27:
                jl41 jl41Var = (jl41) this.c;
                hm5.M(obj);
                al41 al41Var = (al41) this.b;
                if (al41Var.c) {
                    jf4 jf4Var = jl41Var.g.a;
                    if (jf4Var.v() && jf4Var.p() && jl41Var.e.a()) {
                        jl41Var.f.a();
                    } else {
                        a1r0.j(jl41Var.b, "spotify:internal:magpie:update-cadence", al41Var.b, i7w0.e(iko1.y(al41Var.a, bm41.b)), false, 8);
                    }
                } else {
                    a1r0.j(jl41Var.b, "spotify:internal:magpie:update-cadence", al41Var.b, i7w0.e(iko1.y(al41Var.a, bm41.b)), false, 8);
                }
                return rih1.a;
            case 28:
                er91 er91Var2 = (er91) this.c;
                hm5.M(obj);
                kt91 kt91Var3 = ((jl41) this.b).c;
                if (kt91Var3.g()) {
                    kt91Var3.k(er91Var2);
                } else {
                    kt91Var3.o(er91Var2);
                }
                return rih1.a;
            default:
                hm5.M(obj);
                qn41 qn41Var = (qn41) this.b;
                qn41Var.e.set(this.c);
                qn41Var.f.c((Object) null);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2z0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2z0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
