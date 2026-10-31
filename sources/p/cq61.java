package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.SignalCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cq61 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq61(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1VarG;
        zz zzVar;
        p6r0 p6r0VarG1;
        ulw0 qlw0Var;
        d011 h011Var;
        int i;
        byte b = this.a;
        byte b2 = 26;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        byte b3 = 3;
        boolean z2 = false;
        tv80 tv80VarY = null;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                mv61 mv61Var = (mv61) obj;
                if (mv61Var.equals(mv61.b)) {
                    mv61Var = null;
                }
                if (mv61Var != null) {
                    return (w7h1) ((zu30) obj5).J(mv61Var.a, obj2, obj3, obj4);
                }
                return null;
            case 1:
                pml0 pml0Var = (pml0) obj;
                if (pq61.a[((mq61) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                String str = (String) ((yup0) obj5).d;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), pml0Var.a, pml0Var.b.b, System.currentTimeMillis());
            case 2:
                jjm0 jjm0Var = (jjm0) obj;
                oy61 oy61Var = (oy61) obj2;
                int iIntValue = ((Number) obj4).intValue();
                wy61 wy61Var = (wy61) obj5;
                x340 x340Var = (b0k) obj3;
                x340Var.i0(1611122221);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                String str2 = oy61Var.a;
                int i2 = (iIntValue & 112) ^ 48;
                boolean zI = x340Var.i(ven0Var) | x340Var.i(wy61Var) | ((i2 > 32 && x340Var.g(oy61Var)) || (iIntValue & 48) == 32);
                Object objT2 = x340Var.T();
                boolean z3 = false;
                if (zI || objT2 == m4cVar) {
                    objT2 = new sew0(wy61Var, oy61Var, ven0Var, (lnm) null, (byte) 24);
                    x340Var.s0(objT2);
                }
                qxd0.t(str2, x340Var, (vu30) objT2);
                boolean zI2 = x340Var.i(wy61Var);
                if ((i2 <= 32 || !x340Var.g(oy61Var)) && (iIntValue & 48) != 32) {
                    z = false;
                }
                boolean z4 = zI2 | z;
                Object objT3 = x340Var.T();
                if (z4 || objT3 == m4cVar) {
                    objT3 = new vd2(wy61Var, oy61Var, z3, b2);
                    x340Var.s0(objT3);
                }
                jjm0Var.a((zu30) objT3, x340Var, (iIntValue << 3) & 112);
                sy61 sy61Var = new sy61(((Boolean) ven0Var.getValue()).booleanValue());
                x340Var.r(false);
                return sy61Var;
            case 3:
                g271 g271Var = (g271) obj;
                ((Number) obj3).intValue();
                hyl0 hyl0Var = (hyl0) ((smp0) obj5).c;
                hyl0Var.getClass();
                return new fyl0(new gyl0(hyl0Var), g271Var.a.a.b.a(), Integer.valueOf(g271Var.b));
            case 4:
                jjm0 jjm0Var2 = (jjm0) obj;
                a371 a371Var = (a371) obj2;
                int iIntValue2 = ((Number) obj4).intValue();
                wy61 wy61Var2 = (wy61) obj5;
                x340 x340Var2 = (b0k) obj3;
                x340Var2.i0(701282925);
                Object objT4 = x340Var2.T();
                m4c m4cVar2 = fkj0.X;
                if (objT4 == m4cVar2) {
                    objT4 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT4);
                }
                ven0 ven0Var2 = (ven0) objT4;
                String str3 = a371Var.a;
                int i3 = (iIntValue2 & 112) ^ 48;
                boolean zI3 = x340Var2.i(ven0Var2) | x340Var2.i(wy61Var2) | ((i3 > 32 && x340Var2.g(a371Var)) || (iIntValue2 & 48) == 32);
                Object objT5 = x340Var2.T();
                boolean z5 = false;
                if (zI3 || objT5 == m4cVar2) {
                    sew0 sew0Var = new sew0(wy61Var2, a371Var, ven0Var2, (lnm) null, (byte) 26);
                    x340Var2.s0(sew0Var);
                    objT5 = sew0Var;
                }
                qxd0.t(str3, x340Var2, (vu30) objT5);
                boolean zI4 = x340Var2.i(wy61Var2);
                if ((i3 <= 32 || !x340Var2.g(a371Var)) && (iIntValue2 & 48) != 32) {
                    z = false;
                }
                boolean z6 = zI4 | z;
                Object objT6 = x340Var2.T();
                if (z6 || objT6 == m4cVar2) {
                    objT6 = new vd2(wy61Var2, a371Var, z5, (byte) 27);
                    x340Var2.s0(objT6);
                }
                jjm0Var2.a((zu30) objT6, x340Var2, (iIntValue2 << 3) & 112);
                b371 b371Var = new b371(((Boolean) ven0Var2.getValue()).booleanValue());
                x340Var2.r(false);
                return b371Var;
            case 5:
                im0 im0Var = (im0) obj5;
                Flowable flowable = im0Var.b;
                return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new nn61(im0Var, (tqw) obj4, z2, b3));
            case 6:
                jjm0 jjm0Var3 = (jjm0) obj;
                qa71 qa71Var = (qa71) obj2;
                int iIntValue3 = ((Number) obj4).intValue();
                sa71 sa71Var = (sa71) obj5;
                Object obj6 = fkj0.X;
                x340 x340Var3 = (b0k) obj3;
                x340Var3.i0(-411595288);
                boolean zG = x340Var3.g(qa71Var.a);
                Object objT7 = x340Var3.T();
                if (zG || objT7 == obj6) {
                    objT7 = v8r.q(Float.valueOf(0.0f));
                    x340Var3.s0(objT7);
                }
                ven0 ven0Var3 = (ven0) objT7;
                boolean zI5 = x340Var3.i(sa71Var) | x340Var3.g(ven0Var3);
                Object objT8 = x340Var3.T();
                if (zI5 || objT8 == obj6) {
                    objT8 = new vd2(sa71Var, ven0Var3, tv80VarY, (byte) 28);
                    x340Var3.s0(objT8);
                }
                jjm0Var3.a((zu30) objT8, x340Var3, (iIntValue3 << 3) & 112);
                if ((((iIntValue3 & 112) ^ 48) <= 32 || !x340Var3.g(qa71Var)) && (iIntValue3 & 48) != 32) {
                    z = false;
                }
                Object objT9 = x340Var3.T();
                if (z || objT9 == obj6) {
                    objT9 = g0p1.u(qa71Var);
                    x340Var3.s0(objT9);
                }
                ra71 ra71Var = (ra71) objT9;
                ra71 ra71Var2 = new ra71(ra71Var.a, ra71Var.b, ra71Var.c, ra71Var.d, ra71Var.e, ra71Var.f, ra71Var.g, ra71Var.h, ra71Var.i, nvj1.c, ra71Var.k, ra71Var.l);
                x340Var3.r(false);
                return ra71Var2;
            case 7:
                ((Number) obj3).intValue();
                return new cyl0(new eyl0((opl0) ((rwj) obj5).g), 1, null);
            case 8:
                otw.c((p081) obj5, ((c181) obj).a, (qim0) obj2, (ipb1) null, (b0k) obj3, (((Number) obj4).intValue() << 3) & 896, 8);
                return rih1Var;
            case 9:
                hey0 hey0Var = (hey0) obj;
                ((Number) obj3).intValue();
                t4m0 t4m0Var = (t4m0) ((rt01) obj5).d;
                t4m0Var.getClass();
                return new s4m0(Integer.valueOf(hey0Var.c), hey0Var.a.a, new mjl0(t4m0Var));
            case 10:
                return new cel0(new eel0(Integer.valueOf(((Number) obj3).intValue()), ((dof1) obj5).d, (r6h1) obj4));
            case 11:
                vql0 vql0Var = (vql0) obj;
                id81 id81Var = (id81) obj2;
                he81 he81Var = (he81) obj3;
                cd81 cd81Var = (cd81) obj4;
                n1x n1xVar = id81Var.e;
                String str4 = he81Var.d;
                sc81 sc81Var = sc81.a;
                if (cd81Var.equals(sc81Var)) {
                    w7h1VarG = vql0Var.a(str4);
                } else {
                    w7h1VarG = cd81Var.equals(tc81.a) ? vql0Var.g() : null;
                }
                hd81 hd81Var = (hd81) obj5;
                l0x0 l0x0Var = hd81Var.c;
                if (cd81Var.equals(sc81Var) || cd81Var.equals(wc81.a)) {
                    l0x0Var.o(new qy(gho1.r(n1xVar), wgo1.w(n1xVar)));
                } else if (cd81Var instanceof uc81) {
                    uc81 uc81Var = (uc81) cd81Var;
                    boolean z7 = uc81Var.a;
                    l0x0Var.o(new z00(wgo1.x(n1xVar), gho1.r(n1xVar), z7));
                    if (!z7) {
                        hd81Var.Y0 = null;
                    } else if (!n1xVar.a.equals(hd81Var.X0)) {
                        boolean z8 = he81Var.F;
                        boolean z9 = uc81Var.b;
                        if (z8) {
                            hd81Var.e(id81Var, he81Var, z9);
                        } else {
                            hd81Var.Y0 = Boolean.valueOf(z9);
                        }
                    }
                    if (z7 && he81Var.u && !hd81Var.W0) {
                        t2j0 t2j0Var = hd81Var.R0;
                        krh krhVar = hd81Var.S0;
                        ov20 ov20Var = hd81Var.T0;
                        llm llmVar = hd81Var.U0;
                        hd81Var.W0 = true;
                        fn31.T(llmVar, (o8n) null, 0, new hgo0((byte) 19, ov20Var, krhVar, id81Var, t2j0Var, hd81Var, (lnm) null), 3);
                    }
                } else if (cd81Var instanceof zc81) {
                    List listW = wgo1.w(n1xVar);
                    if (he81Var.g) {
                        zzVar = zz.a;
                    } else {
                        zzVar = he81Var.h ? b00.a : a00.a;
                    }
                    l0x0Var.o(new d00(gho1.r(n1xVar), listW, zzVar));
                } else if (cd81Var.equals(xc81.a)) {
                    l0x0Var.o(new cz(gho1.r(n1xVar), wgo1.w(n1xVar), he81Var.i ? az.a : zy.a));
                } else if (cd81Var.equals(vc81.a)) {
                    l0x0Var.o(new wy(gho1.r(n1xVar)));
                } else if (cd81Var.equals(ad81.a)) {
                    l0x0Var.o(new e00(wgo1.w(n1xVar), gho1.r(n1xVar), u890.j(((elv0) hd81Var.h.a().getValue()).a.get(str4), Boolean.TRUE)));
                } else if (cd81Var.equals(yc81.a)) {
                    l0x0Var.o(new uz(gho1.r(n1xVar), wgo1.w(n1xVar)));
                }
                return w7h1VarG;
            case 12:
                ((Number) obj3).intValue();
                return ((zg81) obj5).f;
            case 13:
                ((Number) obj3).intValue();
                uzl0 uzl0Var = (uzl0) ((pt) obj5).e;
                uzl0Var.getClass();
                return new pzl0(uzl0Var);
            case 14:
                ((Number) obj3).intValue();
                uzl0 uzl0Var2 = (uzl0) ((res) obj5).f;
                uzl0Var2.getClass();
                return new pzl0(uzl0Var2);
            case 15:
                q491 q491Var = (q491) obj;
                p491 p491Var = (p491) obj2;
                n491 n491Var = (n491) obj3;
                if (n491Var.equals(l491.a)) {
                    return ((w9u0) ((a4f0) obj5).c).a(new k9u0(SignalCommand.create("skip-ad"))).ignoreElement();
                }
                if (n491Var.equals(m491.a)) {
                    return new CompletableFromAction(new tt60(q491Var, p491Var, (byte) 25));
                }
                eg.o();
                return null;
            case 16:
                jjm0 jjm0Var4 = (jjm0) obj;
                z491 z491Var = (z491) obj2;
                int iIntValue4 = ((Number) obj4).intValue();
                c591 c591Var = (c591) obj5;
                x340 x340Var4 = (b0k) obj3;
                x340Var4.i0(-1326364045);
                Object objT10 = x340Var4.T();
                m4c m4cVar3 = fkj0.X;
                if (objT10 == m4cVar3) {
                    objT10 = v8r.q(Boolean.FALSE);
                    x340Var4.s0(objT10);
                }
                ven0 ven0Var4 = (ven0) objT10;
                boolean zI6 = x340Var4.i(ven0Var4) | x340Var4.i(c591Var);
                if ((((iIntValue4 & 112) ^ 48) <= 32 || !x340Var4.g(z491Var)) && (iIntValue4 & 48) != 32) {
                    z = false;
                }
                boolean z10 = zI6 | z;
                Object objT11 = x340Var4.T();
                if (z10 || objT11 == m4cVar3) {
                    cz40 cz40Var = new cz40(ven0Var4, c591Var, z491Var, (lnm) null, (byte) 6);
                    x340Var4.s0(cz40Var);
                    objT11 = cz40Var;
                }
                jjm0Var4.a((zu30) objT11, x340Var4, (iIntValue4 << 3) & 112);
                a591 a591Var = new a591(((Boolean) ven0Var4.getValue()).booleanValue());
                x340Var4.r(false);
                return a591Var;
            case 17:
                tqw tqwVar = (tqw) obj4;
                n691 n691Var = (n691) obj5;
                Flowable flowable2 = n691Var.a;
                FlowableSingleSingle flowableSingleSingle = new FlowableSingleSingle(ydh.f(flowable2, flowable2));
                Single map = flowableSingleSingle.map(m9x0.N0);
                tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                return Completable.m(new CompletableSource[]{flowableSingleSingle.flatMapCompletable(new ke71((Object) n691Var, (Object) tv80VarY, (byte) 20)), map.flatMapCompletable(new n381((Object) n691Var, (Object) tv80VarY, (byte) 12))});
            case 18:
                return ((w691) obj5).a.a(new o9u0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build())).ignoreElement();
            case 19:
                return new i34((Context) obj2, (rt01) obj5);
            case 20:
                e791 e791Var = (e791) obj2;
                g791 g791Var = e791Var.a;
                if (!(g791Var instanceof g791)) {
                    if (g791Var == null) {
                        return CompletableEmpty.a;
                    }
                    eg.o();
                    return null;
                }
                w9u0 w9u0Var = ((h791) obj5).a;
                long j = ((long) g791Var.c) + 1;
                String str5 = e791Var.b;
                SeekToCommand.Builder builder = SeekToCommand.builder(j);
                CommandOptions.Builder builder2 = CommandOptions.builder();
                if (str5 != null) {
                    builder2.getClass();
                    builder2.onlyForPlaybackId(str5);
                }
                return w9u0Var.a(new j9u0(builder.options(builder2.build()).relative(SeekToCommand.Relative.BEGINNING).build())).ignoreElement();
            case 21:
                bs0 bs0Var = (bs0) obj5;
                Flowable flowable3 = (Flowable) bs0Var.d;
                return new FlowableSingleSingle(ydh.f(flowable3, flowable3)).flatMapCompletable(new nn61(bs0Var, (tqw) obj4, z2, b2));
            case 22:
                th91 th91Var = (th91) obj2;
                ((Number) obj3).intValue();
                td20 td20Var = (td20) obj5;
                d8r0 d8r0VarA = td20Var.b.a();
                List listJ = th91Var.e;
                if (listJ == null) {
                    listJ = tx9.j(th91Var);
                }
                if (listJ.isEmpty()) {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    p6r0VarG1 = yon1.U4();
                } else {
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    p6r0VarG1 = yon1.G1("SEARCH_FILTERED", "search/filtered", 1786, "search");
                }
                return new iwl0(new qgl0(new mjl0(td20Var.a, p6r0VarG1.c, d8r0VarA.a, d8r0VarA.e)));
            case 23:
                ((Number) obj3).intValue();
                return new f0m0(((tm91) obj5).a.path(), ((fm91) obj).a, (r6h1) obj4);
            case 24:
                gyf1 gyf1Var = (gyf1) obj;
                lyf1 lyf1Var = (lyf1) obj2;
                zxf1 zxf1Var = (zxf1) obj3;
                tv80 tv80Var = (tv80) obj4;
                String str6 = gyf1Var.d;
                String str7 = gyf1Var.b;
                String str8 = gyf1Var.a;
                PublishSubject publishSubject = (PublishSubject) ((rt01) obj5).d;
                if (zxf1Var.equals(vxf1.a)) {
                    h011Var = new d011(str8, str7, str6, tv80Var);
                } else {
                    if (!zxf1Var.equals(sxf1.a)) {
                        if (zxf1Var.equals(yxf1.a)) {
                            String str9 = gyf1Var.g;
                            rqt0 rqt0Var = lyf1Var.d;
                            if (rqt0Var instanceof fyf1) {
                                qlw0Var = slw0.a;
                            } else if (rqt0Var instanceof dyf1) {
                                qlw0Var = plw0.a;
                            } else if (rqt0Var instanceof eyf1) {
                                eyf1 eyf1Var = (eyf1) rqt0Var;
                                qlw0Var = new qlw0(eyf1Var.i, eyf1Var.j);
                            } else {
                                eg.o();
                            }
                            h011Var = new h011(str8, str7, str9, qlw0Var);
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    h011Var = new yz01(str8, str6, tv80Var);
                }
                publishSubject.onNext(h011Var);
                return rih1Var;
            case 25:
                return new vh((Context) obj2, (iu30) obj4, (vyf1) obj5);
            case 26:
                tw91 tw91Var = (tw91) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var5 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    i = iIntValue5 | (x340Var5.g(tw91Var) ? 4 : 2);
                } else {
                    i = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i |= x340Var5.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i & 1, (i & 147) != 146)) {
                    ((vw91) obj5).b.v(tw91Var, iu30Var, x340Var6, i & 126);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new as0((sma1) obj5, (Context) obj2, (ViewGroup) obj3, (d75) obj, (iu30) obj4);
            case 28:
                jjm0 jjm0Var5 = (jjm0) obj;
                int iIntValue6 = ((Number) obj4).intValue();
                x340 x340Var7 = (b0k) obj3;
                x340Var7.i0(891612364);
                rwj rwjVar = (rwj) obj5;
                ven0 ven0VarG = rwq.g(((n0b1) rwjVar.d).c, Boolean.TRUE, (o8n) null, x340Var7, 48, 2);
                mr20 mr20Var = (mr20) rwjVar.g;
                Boolean bool = Boolean.FALSE;
                ven0 ven0VarG2 = rwq.g(mr20Var, bool, (o8n) null, x340Var7, 48, 2);
                Object objT12 = x340Var7.T();
                m4c m4cVar4 = fkj0.X;
                if (objT12 == m4cVar4) {
                    objT12 = v8r.q(bool);
                    x340Var7.s0(objT12);
                }
                ven0 ven0Var5 = (ven0) objT12;
                boolean zI7 = x340Var7.i(ven0Var5) | x340Var7.i(ven0VarG2) | x340Var7.i(rwjVar);
                Object objT13 = x340Var7.T();
                if (zI7 || objT13 == m4cVar4) {
                    objT13 = new jvu(rwjVar, ven0VarG2, ven0Var5, (lnm) null);
                    x340Var7.s0(objT13);
                }
                jjm0Var5.a((zu30) objT13, x340Var7, (iIntValue6 << 3) & 112);
                l0b1 l0b1Var = new l0b1(((Boolean) ven0VarG.getValue()).booleanValue());
                x340Var7.r(false);
                return l0b1Var;
            default:
                ((jeb1) obj5).f((geb1) obj2, (b0k) obj3, (((Number) obj4).intValue() >> 3) & 14);
                return rih1Var;
        }
    }
}
