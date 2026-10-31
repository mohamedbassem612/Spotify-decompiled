package p;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rwm0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwm0(Object obj, bjk1 bjk1Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 11;
        jsq0 jsq0Var = jsq0.b;
        this.b = obj;
        this.d = bjk1Var;
        this.c = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 0);
            case 1:
                rwm0 rwm0Var = new rwm0(obj3, obj2, lnmVar, (byte) 1);
                rwm0Var.b = obj;
                return rwm0Var;
            case 2:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 2);
            case 3:
                rwm0 rwm0Var2 = new rwm0(obj3, obj2, lnmVar, (byte) 3);
                rwm0Var2.b = obj;
                return rwm0Var2;
            case 4:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 4);
            case 5:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 5);
            case 6:
                rwm0 rwm0Var3 = new rwm0(obj3, obj2, lnmVar, (byte) 6);
                rwm0Var3.b = obj;
                return rwm0Var3;
            case 7:
                rwm0 rwm0Var4 = new rwm0(obj3, lnmVar, (s1q0) obj2);
                rwm0Var4.b = obj;
                return rwm0Var4;
            case 8:
                return new rwm0(this.b, obj2, (ven0) obj3, lnmVar, (byte) 8);
            case 9:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 9);
            case 10:
                return new rwm0(this.b, obj2, (ven0) obj3, lnmVar, (byte) 10);
            case 11:
                jsq0 jsq0Var = jsq0.b;
                return new rwm0(this.b, (bjk1) obj2, (ven0) obj3, lnmVar);
            case 12:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 12);
            case 13:
                return new rwm0(this.b, obj2, (ven0) obj3, lnmVar, (byte) 13);
            case 14:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 14);
            case 15:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 15);
            case 16:
                rwm0 rwm0Var5 = new rwm0(obj3, obj2, lnmVar, (byte) 16);
                rwm0Var5.b = obj;
                return rwm0Var5;
            case 17:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 17);
            case 18:
                rwm0 rwm0Var6 = new rwm0(obj3, obj2, lnmVar, (byte) 18);
                rwm0Var6.b = obj;
                return rwm0Var6;
            case 19:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 19);
            case 20:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 20);
            case 21:
                rwm0 rwm0Var7 = new rwm0(obj3, obj2, lnmVar, (byte) 21);
                rwm0Var7.b = obj;
                return rwm0Var7;
            case 22:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 22);
            case 23:
                return new rwm0((ven0) obj3, this.b, obj2, lnmVar, (byte) 23);
            case 24:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 24);
            case 25:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 25);
            case 26:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 26);
            case 27:
                return new rwm0((ven0) obj3, this.b, obj2, lnmVar, (byte) 27);
            case 28:
                return new rwm0(this.b, obj3, obj2, lnmVar, (byte) 28);
            default:
                rwm0 rwm0Var8 = new rwm0(obj3, obj2, lnmVar, (byte) 29);
                rwm0Var8.b = obj;
                return rwm0Var8;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                return create((ptb0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((cxc0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                return create((whx0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                return create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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

    /* JADX WARN: Code duplicated, block: B:75:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:86:0x0200  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws Exception {
        iu30 iu30Var;
        String string;
        boolean z;
        byte b = this.a;
        lnm lnmVarC = 0;
        lnmVarC = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    ven0 ven0Var = (ven0) obj3;
                    ven0Var.setValue(q3p1.r((zau0) this.b, (r091) ven0Var.getValue()));
                }
                return rih1Var;
            case 1:
                c9n c9nVar = (c9n) this.b;
                hm5.M(obj);
                return fn31.q(c9nVar, (o8n) null, 0, new d7i0(obj2, obj3, lnmVarC, (byte) 28), 3);
            case 2:
                hm5.M(obj);
                ((f1n0) this.b).a.i((dwn0) obj2, (Bundle) obj3);
                return rih1Var;
            case 3:
                String str = (String) obj2;
                hm5.M(obj);
                try {
                    ne neVar = new ne((byte) 9);
                    neVar.e0(str);
                    ry21 ry21VarE = ((a8o0) obj3).c.c().a(new ln21(neVar)).e();
                    uz21 uz21Var = ry21VarE.g;
                    if (ry21VarE.Q0) {
                        lnmVarC = uz21Var.c();
                    } else {
                        try {
                            uz21Var.close();
                            break;
                        } catch (Throwable unused) {
                        }
                        Logger.d("HTTP error " + ry21VarE.d + " for URL: " + str, new Object[0]);
                    }
                    break;
                } catch (Exception e) {
                    Logger.e(e, l1d.m("Network error for URL: ", str), new Object[0]);
                }
                return lnmVarC;
            case 4:
                hm5.M(obj);
                gqo0 gqo0Var = (gqo0) this.b;
                moo0 moo0Var = (moo0) gqo0Var.g.get();
                tv80 tv80Var = (tv80) obj2;
                fpo fpoVar = gqo0Var.n.c() ? new fpo(gqo0Var, (String) obj3, (lnm) null, (byte) 25) : null;
                int iC = l1d.C(moo0Var.d.e());
                if (iC == 0) {
                    lcs.b((Context) moo0Var.b.get(), (lcs) moo0Var.e.get());
                } else if (iC == 1) {
                    moo0Var.a(fpoVar);
                } else if (iC == 2) {
                    ((lzn0) moo0Var.a.get()).f(new dwn0(nik1.F2.a, "", false, false, 0, 0, false, null, null, tv80Var != null ? new bwn0(tv80Var) : null));
                    moo0Var.a(fpoVar);
                } else if (iC != 3) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 5:
                hm5.M(obj);
                if (((pro0) this.b).d) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        ((ihg0) obj2).a("android.permission.POST_NOTIFICATIONS");
                    } else {
                        ((iu30) obj3).invoke(iro0.a);
                    }
                }
                return rih1Var;
            case 6:
                ptb0 ptb0Var = (ptb0) this.b;
                hm5.M(obj);
                List list = ptb0Var.l;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj3;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h8k1 h8k1Var = (h8k1) linkedHashMap.get(((qtb0) it.next()).l);
                    if (h8k1Var != null) {
                        arrayList.add(h8k1Var);
                    }
                }
                return new qnc0(((rnc0) obj2).a, arrayList);
            case 7:
                hm5.M(obj);
                ((s1q0) obj3).J().d();
                return rih1Var;
            case 8:
                hm5.M(obj);
                bpb1 bpb1Var = (wen0) this.b;
                mwq0 mwq0Var = (mwq0) obj3;
                Boolean boolValueOf = Boolean.valueOf(!mwq0Var.a());
                bpb1 bpb1Var2 = bpb1Var;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, boolValueOf);
                if (!mwq0Var.a()) {
                    ((ven0) obj2).setValue((Object) null);
                }
                return rih1Var;
            case 9:
                hm5.M(obj);
                if (u890.j((hzn0) this.b, gzn0.a)) {
                    ((scx) obj2).a();
                    ((Function0) obj3).invoke();
                }
                return rih1Var;
            case 10:
                haw0 haw0Var = (haw0) obj3;
                hm5.M(obj);
                dj41 dj41Var = (dj41) this.b;
                if (dj41Var != null && haw0Var != null && !((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    dj41Var.l.C(haw0Var);
                    dj41Var.o = true;
                    if (dj41Var.n != null) {
                        dj41Var.f();
                    }
                }
                return rih1Var;
            case 11:
                hm5.M(obj);
                ven0 ven0Var2 = (ven0) obj2;
                if (jsq0.b.get(ven0Var2.getValue()).equals(this.b)) {
                    ven0Var2.setValue((bjk1) obj3);
                }
                return rih1Var;
            case 12:
                hm5.M(obj);
                ven0 ven0Var3 = (ven0) obj2;
                if (((cxb) ven0Var3.getValue()) == null || ((hcr0) ((ven0) obj3).getValue()) == null) {
                    ((dxb) this.b).a.t(0);
                    cxb cxbVar = (cxb) ven0Var3.getValue();
                    if (cxbVar != null && (iu30Var = cxbVar.a) != null) {
                        iu30Var.invoke(new Integer(0));
                    }
                }
                return rih1Var;
            case 13:
                zwq0 zwq0Var = (zwq0) obj3;
                hm5.M(obj);
                rk41 rk41Var = (rk41) this.b;
                if (!rk41Var.a && ((Boolean) zwq0Var.c.invoke(((wgm1) ((ven0) obj2).getValue()).a)).booleanValue()) {
                    xgm1 xgm1Var = (xgm1) rk41Var.c;
                    rx7 rx7Var = zwq0Var.b;
                    xgm1Var.a(new lgm1(rx7Var.a, rx7Var.b, rx7Var.c));
                }
                return rih1Var;
            case 14:
                hm5.M(obj);
                ((b1r0) this.b).a.f((dwn0) obj2, (Bundle) obj3, false);
                return rih1Var;
            case 15:
                hm5.M(obj);
                String str2 = nik1.D5.a;
                Bundle bundle = new Bundle();
                bundle.putParcelable("jam.permission.upgrade.sheet.args", (zms0) obj3);
                ((ser) ((tzr0) this.b).b).a((String) obj2, str2, bundle);
                return rih1Var;
            case 16:
                cxc0 cxc0Var = (cxc0) this.b;
                hm5.M(obj);
                Map map = cxc0Var.f.q;
                Set set = h4d0.a;
                String str3 = (String) map.get("generation_status");
                if (str3 == null || (string = ihc1.e1(str3).toString()) == null) {
                    string = "";
                }
                h4d0 h4d0VarU = qyo1.u(string);
                if (!cxc0Var.a()) {
                    h4d0VarU.getClass();
                    if (h4d0.a.contains(h4d0VarU)) {
                        u6y0 u6y0Var = ((u6y0) obj2).i;
                        fn31.T(u6y0Var.Y, (o8n) null, 0, new cqu0(u6y0Var, (String) ((rb3) obj3).c, (lnm) null, (byte) 25), 3);
                    }
                }
                return rih1Var;
            case 17:
                hm5.M(obj);
                try {
                    lqt0 lqt0Var = (lqt0) obj2;
                    ((mqt0) this.b).e.b(lqt0Var.b, (r091) obj3, lqt0Var.a, lqt0Var.d);
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Exception e3) {
                    Logger.e(e3, "Failed to start preview tracking", new Object[0]);
                }
                return rih1Var;
            case 18:
                whx0 whx0Var = (whx0) this.b;
                hm5.M(obj);
                iix0 iix0Var = (iix0) whx0Var.a.get(((sqt0) obj3).b);
                return iix0Var == null ? new hix0(false, 0L) : iix0Var;
            case 19:
                String str4 = (String) obj3;
                hm5.M(obj);
                String str5 = (String) this.b;
                lzn0 lzn0Var = (lzn0) ((s24) obj2).f;
                if (str5 != null) {
                    ou80.Companion.getClass();
                    lzn0Var.a(str4, new tv80(new ou80(str5), (y6r0) null), (Bundle) null);
                } else {
                    lzn0Var.h(str4);
                }
                return rih1Var;
            case 20:
                hm5.M(obj);
                g1u0 g1u0Var = (g1u0) this.b;
                x0u0 x0u0Var = (x0u0) obj2;
                g1u0Var.v = x0u0Var != null ? x0u0Var.a : null;
                w0u0 w0u0Var = (w0u0) obj3;
                g1u0Var.w = w0u0Var;
                ktl ktlVar = w0u0Var.a;
                if (ktlVar != null) {
                    g1u0Var.x = ktlVar;
                }
                Boolean bool = w0u0Var.b;
                if (bool != null) {
                    g1u0Var.y = g1u0Var.o.b && bool.booleanValue();
                }
                g1u0Var.h(g1u0Var.t);
                return rih1Var;
            case 21:
                PlayerState playerState = (PlayerState) this.b;
                hm5.M(obj);
                if (!playerState.isPaused()) {
                    String str6 = (String) obj3;
                    ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                    z = u890.j(contextTrack != null ? l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_POINTER_URI) : null, str6);
                }
                return Boolean.valueOf(z);
            case 22:
                hm5.M(obj);
                spn spnVar = (spn) ((q9b) this.b).c;
                qmn qmnVar = (qmn) obj2;
                String str7 = qmnVar.a;
                if (str7.length() > 0) {
                    bzu0 bzu0VarC = oxu0.a.c(str7);
                    if ((bzu0VarC instanceof bzu0 ? bzu0VarC : null) == null) {
                        str7 = null;
                    }
                } else {
                    str7 = null;
                }
                String str8 = qmnVar.a;
                spnVar.a(false, new cqn(str7, (String) null, new zpn(false, (List) null, (List) null, (List) null, str8, str8, (ypn) null, false, 1855), 2), (tv80) obj3);
                return rih1Var;
            case 23:
                hm5.M(obj);
                ((ven0) obj2).setValue(((j1v0) this.b).c((vhc1) obj3));
                return rih1Var;
            case 24:
                hm5.M(obj);
                ((ssw0) this.b).l(Boolean.valueOf(((j1v0) obj2).a((xe91) obj3)));
                return rih1Var;
            case 25:
                hm5.M(obj);
                ((lzn0) ((njv0) this.b).e.get()).a(((uiv0) obj2).a, cvl1.d((tqw) obj3), (Bundle) null);
                return rih1Var;
            case 26:
                hm5.M(obj);
                String str9 = (String) this.b;
                xmu0 xmu0Var = (xmu0) obj2;
                File file = (File) obj3;
                File file2 = new File(file, xmu0.i(str9).concat(".mp3"));
                File file3 = new File(file, xmu0.i(str9).concat(".tmp"));
                try {
                    ne neVar2 = new ne((byte) 9);
                    neVar2.e0(str9);
                    ry21 ry21VarE2 = ((cxc) xmu0Var.c).a(new ln21(neVar2)).e();
                    try {
                        if (!ry21VarE2.Q0) {
                            throw new IllegalStateException("Preview download failed: " + ry21VarE2.d);
                        }
                        InputStream inputStreamA = ry21VarE2.g.a();
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            try {
                                o0c.w(inputStreamA, fileOutputStream);
                                fileOutputStream.close();
                                inputStreamA.close();
                                ry21VarE2.close();
                                if (file3.renameTo(file2)) {
                                    return new mmr0(str9, Uri.fromFile(file2).toString());
                                }
                                throw new IllegalStateException("Failed to rename temp file to " + file2.getName());
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    u890.p(fileOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                u890.p(inputStreamA, th3);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            u890.p(ry21VarE2, th5);
                            throw th6;
                        }
                    }
                } catch (Exception e4) {
                    file3.delete();
                    throw e4;
                }
                file3.delete();
                throw e4;
            case 27:
                ven0 ven0Var4 = (ven0) obj2;
                hm5.M(obj);
                if (u890.j((o091) ((ven0) obj3).getValue(), n091.a) && !((Boolean) ven0Var4.getValue()).booleanValue()) {
                    ven0Var4.setValue(Boolean.TRUE);
                    ((xjw0) this.b).i.invoke();
                }
                return rih1Var;
            case 28:
                hm5.M(obj);
                if (!((wfx0) this.b).a()) {
                    ((ven0) obj2).setValue((Object) null);
                    ((ven0) obj3).setValue((Object) null);
                }
                return rih1Var;
            default:
                hm5.M(obj);
                c9n c9nVar2 = (c9n) this.b;
                dlx0 dlx0Var = (dlx0) obj2;
                tac0 tac0Var = dlx0Var.d;
                tac0Var.f("getObserverCount");
                z = tac0Var.c.H() == 0;
                tac0Var.a((hac0) obj3);
                if (z) {
                    fn31.T(c9nVar2, dlx0Var.c, 0, new zkx0(dlx0Var, null, (byte) 0), 2);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rwm0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rwm0(Object obj, Object obj2, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwm0(Object obj, lnm lnmVar, s1q0 s1q0Var) {
        super(2, lnmVar);
        this.a = (byte) 7;
        this.c = obj;
        this.d = s1q0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rwm0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rwm0(ven0 ven0Var, Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ven0Var;
        this.b = obj;
        this.d = obj2;
    }
}
