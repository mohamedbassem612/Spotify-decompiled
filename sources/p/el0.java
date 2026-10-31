package p;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.bluejay.upload.impl.worker.AttachmentUploadWorker;
import com.spotify.collection_esperanto.proto.BanInPlayContextRequest;
import com.spotify.kodiak.dataloader.statement.DataStatementCrashContext;
import io.reactivex.rxjava3.core.Single;
import java.io.File;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class el0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el0(jnq jnqVar, String str, String str2, String str3, boolean z, tv80 tv80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 23;
        this.c = jnqVar;
        this.f = str;
        this.d = str2;
        this.e = str3;
        this.b = z;
        this.g = tv80Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    private final Object e(Object obj) {
        rsm1 rsm1Var;
        rhc m231Var;
        rhc rhcVarV;
        String str = (String) this.g;
        goq goqVar = (goq) this.c;
        vr20 vr20Var = (vr20) this.d;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            h9n h9nVar = (h9n) goqVar.h;
            Object obj2 = this.e;
            Object obj3 = this.f;
            String str2 = (String) obj3;
            h9nVar.getClass();
            gvm1 gvm1VarO = YourLibraryRequest.o();
            hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
            jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
            jsm1VarR.q(ksm1.d);
            jsm1VarR.q(ksm1.t);
            hvm1VarQ.u(jsm1VarR.build());
            qsm1 qsm1VarN = YourLibraryConfig.YourLibrarySortOrder.n();
            int iOrdinal = ((lia1) obj2).ordinal();
            if (iOrdinal == 0) {
                rsm1Var = rsm1.b;
            } else if (iOrdinal == 1) {
                rsm1Var = rsm1.c;
            } else if (iOrdinal == 2) {
                rsm1Var = rsm1.f;
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return null;
                }
                rsm1Var = rsm1.g;
            }
            qsm1VarN.n(rsm1Var);
            hvm1VarQ.I(qsm1VarN.build());
            hvm1VarQ.K(str);
            hvm1VarQ.w();
            hvm1VarQ.C(Alert.DURATION_SHOW_INDEFINITELY);
            if (str2 != null) {
                try {
                    bzu0 bzu0VarC = oxu0.a.c(str2);
                    bzu0 bzu0Var = bzu0VarC instanceof bzu0 ? bzu0VarC : null;
                    if (bzu0Var != null) {
                        rhcVarV = u890.v(bzu0Var.b);
                    } else {
                        rhcVarV = null;
                    }
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
            } else {
                rhcVarV = null;
            }
            m231Var = rhcVarV;
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            rhc rhcVar = m231Var;
            Long lValueOf = (rhcVar != null && rhcVar.d() == 8) ? Long.valueOf(rhcVar.a().asLongBuffer().get()) : null;
            if (lValueOf != null) {
                hvm1VarQ.v(lValueOf.longValue());
            }
            hvm1VarQ.D();
            hvm1VarQ.q(true);
            gvm1VarO.n(hvm1VarQ);
            gvm1VarO.t(500);
            psm1 psm1VarP = YourLibraryConfig.YourLibraryPredefinedPlaylistConfigs.p();
            int iOrdinal2 = ((ak3) h9nVar.b).ordinal();
            osm1 osm1Var = osm1.d;
            if (iOrdinal2 == 0) {
                nsm1 nsm1VarO = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
                nsm1VarO.q(osm1Var);
                psm1VarP.u(nsm1VarO);
            } else if (iOrdinal2 == 1) {
                nsm1 nsm1VarO2 = YourLibraryConfig.YourLibraryPredefinedPlaylistConfig.o();
                nsm1VarO2.q(osm1Var);
                psm1VarP.z(nsm1VarO2);
            } else if (iOrdinal2 != 2) {
                eg.o();
                return null;
            }
            gvm1VarO.s(psm1VarP.build());
            evz evzVarS = h5p1.s(yoi1.g(((dxz0) goqVar.g).e()), new x3s(((bl3) goqVar.c).n((ak3) goqVar.e), (byte) 14), ((vwm1) goqVar.b).d(gvm1VarO.build()), new ibv((goq) this.c, (lia1) obj2, str, (String) obj3, (lnm) null));
            this.d = null;
            this.b = true;
            Object objS = l4p1.s(vr20Var, evzVarS, this);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                el0 el0Var = new el0(obj3, obj4, obj2, lnmVar, (byte) 0);
                el0Var.d = obj;
                return el0Var;
            case 1:
                return new el0((byte) 1, this.c, this.d, obj3, obj4, obj2, lnmVar);
            case 2:
                return new el0(this.c, this.d, (String) obj4, obj3, obj2, lnmVar, (byte) 2);
            case 3:
                return new el0(this.c, this.d, (String) obj4, obj3, obj2, lnmVar, (byte) 3);
            case 4:
                el0 el0Var2 = new el0(this.c, obj3, obj4, obj2, lnmVar, (byte) 4);
                el0Var2.d = obj;
                return el0Var2;
            case 5:
                return new el0((xb10) this.d, (li7) obj3, (yqi1) obj4, (q8n) obj2, lnmVar);
            case 6:
                return new el0(this.c, (String) obj4, this.d, obj3, obj2, lnmVar, (byte) 6);
            case 7:
                return new el0(obj3, obj4, obj2, lnmVar, (byte) 7);
            case 8:
                el0 el0Var3 = new el0(this.c, (String) obj4, (String) obj3, (String) obj2, lnmVar, (byte) 8);
                el0Var3.d = obj;
                return el0Var3;
            case 9:
                return new el0(obj3, obj4, obj2, lnmVar, (byte) 9);
            case 10:
                return new el0(obj3, obj4, obj2, lnmVar, (byte) 10);
            case 11:
                return new el0(this.b, (ven0) this.c, (ven0) this.d, (ven0) obj3, (iu30) obj4, (at80) obj2, lnmVar);
            case 12:
                return new el0(this.c, (String) obj4, this.d, obj3, obj2, lnmVar, (byte) 12);
            case 13:
                return new el0(obj3, obj4, obj2, lnmVar, (byte) 13);
            case 14:
                return new el0(this.c, (String) obj4, this.d, obj3, obj2, lnmVar, (byte) 14);
            case 15:
                return new el0(this.c, this.d, (String) obj4, obj3, obj2, lnmVar, (byte) 15);
            case 16:
                return new el0((byte) 16, this.c, this.d, obj3, obj4, obj2, lnmVar);
            case 17:
                return new el0((byte) 17, this.c, this.d, obj3, obj4, obj2, lnmVar);
            case 18:
                return new el0((byte) 18, this.c, this.d, obj3, obj4, obj2, lnmVar);
            case 19:
                el0 el0Var4 = new el0(this.c, obj3, obj4, obj2, lnmVar, (byte) 19);
                el0Var4.d = obj;
                return el0Var4;
            case 20:
                el0 el0Var5 = new el0(obj3, obj4, obj2, lnmVar, (byte) 20);
                el0Var5.d = obj;
                return el0Var5;
            case 21:
                el0 el0Var6 = new el0(this.c, (String) obj4, (String) obj3, (String) obj2, lnmVar, (byte) 21);
                el0Var6.d = obj;
                return el0Var6;
            case 22:
                return new el0((byte) 22, this.c, this.d, obj3, obj4, obj2, lnmVar);
            case 23:
                return new el0((jnq) this.c, (String) obj4, (String) this.d, (String) obj3, this.b, (tv80) obj2, lnmVar);
            case 24:
                return new el0(this.c, (String) obj4, this.d, obj3, obj2, lnmVar, (byte) 24);
            case 25:
                return new el0(this.c, (String) obj4, this.d, obj3, obj2, lnmVar, (byte) 25);
            case 26:
                return new el0(this.c, (String) obj4, this.d, obj3, obj2, lnmVar, (byte) 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                el0 el0Var7 = new el0(this.c, obj3, obj4, obj2, lnmVar, (byte) 27);
                el0Var7.d = obj;
                return el0Var7;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                el0 el0Var8 = new el0(obj3, obj4, obj2, lnmVar, (byte) 28);
                el0Var8.d = obj;
                return el0Var8;
            default:
                return new el0(this.c, this.d, (String) obj4, obj3, obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:230:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:435:0x092c  */
    /* JADX WARN: Code duplicated, block: B:436:0x0934  */
    /* JADX WARN: Code duplicated, block: B:446:0x0968  */
    /* JADX WARN: Code duplicated, block: B:516:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) throws Exception {
        al0 al0Var;
        String str;
        Object objA;
        foh1 foh1Var;
        bpb1 bpb1Var;
        Object value;
        jt61 jt61Var;
        it61 it61Var;
        jk40 jk40Var;
        xb10 xb10Var;
        Object objY;
        wkt wktVar;
        iu30 iu30Var;
        Object objA2;
        wkt wktVar2;
        iu30 iu30Var2;
        Object objA3;
        Exception exc;
        ContentResolver contentResolver;
        Uri uri;
        Object objI;
        ven0 ven0Var;
        Object objC;
        ven0 ven0Var2;
        sn7 sn7Var;
        Object objE;
        n511 n511VarB;
        Integer m231Var;
        Object objJ;
        b3j0 z2j0Var;
        ou80 ou80Var;
        Object objE2;
        Object objK;
        bwe1 bwe1Var;
        byte b = this.a;
        boolean zBooleanValue = false;
        c0r c0rVarC = null;
        zBooleanValue = false;
        Object obj2 = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        zxc0 zxc0Var = null;
        switch (b) {
            case 0:
                il0 il0Var = (il0) obj3;
                String str2 = (String) obj4;
                c9n c9nVar = (c9n) this.d;
                boolean z = this.b;
                try {
                    if (z) {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        al0Var = (al0) this.c;
                        hm5.M(obj);
                        objA = obj;
                        foh1Var = (foh1) objA;
                        if (!u890.j(foh1Var.a, Boolean.TRUE)) {
                            return new yl0(foh1Var.b);
                        }
                        bpb1Var = il0Var.b;
                        do {
                            value = bpb1Var.getValue();
                            jt61Var = (jt61) value;
                            if (jt61Var != null || (jk40Var = (jk40) jt61Var.a()) == null) {
                                it61Var = null;
                            } else {
                                z6x z6xVar = jk40Var.a;
                                if (z6xVar == null) {
                                    z6xVar = z6x.a;
                                }
                                it61Var = new it61(new jk40(o7h.O0(new xk0(str2, al0Var.b), (Collection) z6xVar), jk40Var.b));
                            }
                        } while (!bpb1Var.k(value, it61Var));
                        return zl0.a;
                    }
                    hm5.M(obj);
                    int iOrdinal = ((bl0) obj5).ordinal();
                    if (iOrdinal == 0) {
                        str = "INTEREST_LEVEL_DEFAULT";
                    } else if (iOrdinal == 1) {
                        str = "INTEREST_LEVEL_SEE_MORE";
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        str = "INTEREST_LEVEL_SEE_LESS";
                    }
                    al0Var = new al0(str2, str);
                    j72 j72Var = il0Var.a;
                    coh1 coh1Var = new coh1(al0Var);
                    this.d = c9nVar;
                    this.c = al0Var;
                    this.b = true;
                    objA = j72Var.a(coh1Var, this);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    foh1Var = (foh1) objA;
                    if (!u890.j(foh1Var.a, Boolean.TRUE)) {
                        return new yl0(foh1Var.b);
                    }
                    bpb1Var = il0Var.b;
                    do {
                        value = bpb1Var.getValue();
                        jt61Var = (jt61) value;
                        if (jt61Var != null) {
                            it61Var = null;
                        } else {
                            it61Var = null;
                        }
                    } while (!bpb1Var.k(value, it61Var));
                    return zl0.a;
                } catch (Exception e) {
                    smo1.t(c9nVar);
                    return new xl0(e);
                }
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mfe mfeVar = ((yx1) this.c).b;
                zw1 zw1Var = new zw1((ven0) this.d, (ven0) obj5, (ven0) obj4, (ven0) obj3, (byte) 0);
                this.b = true;
                return mfeVar.collect(zw1Var, this) == d9nVar ? d9nVar : obj2;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    Object objA4 = jr2.a(((gx2) this.c).a, (tt2) this.d, (String) obj4, (String) obj5, (dt2) obj3, this, 96);
                    return objA4 == d9nVar ? d9nVar : objA4;
                }
                if (z3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x73 x73Var = (x73) this.c;
                lik1 lik1Var = (lik1) this.d;
                this.b = true;
                Object objS = smo1.s(new u73((String) obj5, (String) obj4, x73Var, (mb3) obj3, (lnm) null, lik1Var), this);
                return objS == d9nVar ? d9nVar : objS;
            case 4:
                ml4 ml4Var = (ml4) obj4;
                jx4 jx4Var = (jx4) this.c;
                boolean z5 = this.b;
                try {
                    if (z5) {
                        if (!z5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        throw new KotlinNothingValueException();
                    }
                    hm5.M(obj);
                    c9n c9nVar2 = (c9n) this.d;
                    c1c0 c1c0Var = d1c0.a;
                    View view = jx4Var.a;
                    c1c0Var.getClass();
                    oj80 oj80Var = new oj80(view);
                    s1c0 s1c0Var = new s1c0(jx4Var.a, new ll4((vzb0) obj3), oj80Var);
                    if (rkc1.a) {
                        fn31.T(c9nVar2, null, 0, new wt(ml4Var, oj80Var, (lnm) null, (byte) 8), 3);
                    }
                    iu30 iu30Var3 = (iu30) obj5;
                    if (iu30Var3 != null) {
                        iu30Var3.invoke(s1c0Var);
                    }
                    ml4Var.c = s1c0Var;
                    this.b = true;
                    jx4Var.a(s1c0Var, this);
                    return d9nVar;
                } catch (Throwable th) {
                    ml4Var.c = null;
                    throw th;
                }
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    xb10Var = (xb10) this.d;
                    this.c = xb10Var;
                    this.b = true;
                    objY = fn31.Y((q8n) obj3, new pid(((li7) obj5).b.a, (yqi1) obj4, (lnm) null, (byte) 24), this);
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xb10Var = (xb10) this.c;
                    hm5.M(obj);
                    objY = obj;
                }
                xb10Var.a.setValue((smr0) objY);
                return obj2;
            case 6:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ik7 ik7Var = ((AttachmentUploadWorker) this.c).i;
                wvh1 wvh1Var = new wvh1((String) obj4, ((File) this.d).length(), (rn21) obj5, (uk7) obj3);
                this.b = true;
                Object objB = ik7Var.b(wvh1Var, this);
                return objB == d9nVar ? d9nVar : objB;
            case 7:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    wktVar = ((pr7) obj5).i;
                    if (wktVar == null) {
                        return obj2;
                    }
                    iu30Var = (iu30) obj4;
                    vwa[] vwaVarArr = {new vwa()};
                    this.c = iu30Var;
                    this.d = wktVar;
                    this.b = true;
                    objA2 = ((xwa) obj3).a(vwaVarArr, this);
                    if (objA2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wktVar = (wkt) this.d;
                    iu30Var = (iu30) this.c;
                    hm5.M(obj);
                    objA2 = obj;
                }
                iu30Var.invoke(new cr7(((wwa) o7h.V0((List) objA2)).b, wktVar));
                return obj2;
            case 8:
                c9n c9nVar3 = (c9n) this.d;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    long j = sm9.a;
                    km9 km9Var = new km9((rm9) this.c, (lnm) null, (byte) 5);
                    this.d = c9nVar3;
                    this.b = true;
                    if (rc2.P(j, km9Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                rm9.e((rm9) this.c, c9nVar3, (String) obj4, ((String) obj3) != null ? (String) obj5 : null, (String) null, 4);
                return obj2;
            case 9:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    wktVar2 = ((lqa) obj5).h;
                    if (wktVar2 == null) {
                        return obj2;
                    }
                    iu30Var2 = (iu30) obj4;
                    vwa[] vwaVarArr2 = {new vwa()};
                    this.c = iu30Var2;
                    this.d = wktVar2;
                    this.b = true;
                    objA3 = ((xwa) obj3).a(vwaVarArr2, this);
                    if (objA3 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wktVar2 = (wkt) this.d;
                    iu30Var2 = (iu30) this.c;
                    hm5.M(obj);
                    objA3 = obj;
                }
                iu30Var2.invoke(new eqa(((wwa) o7h.V0((List) objA3)).b, wktVar2));
                return obj2;
            case 10:
                gya gyaVar = (gya) obj5;
                boolean z11 = this.b;
                if (z11) {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) this.d;
                    ContentResolver contentResolver2 = (ContentResolver) this.c;
                    try {
                        hm5.M(obj);
                        return uri;
                    } catch (Exception e2) {
                        exc = e2;
                        contentResolver = contentResolver2;
                        try {
                            contentResolver.delete(uri, null, null);
                            throw exc;
                        } catch (Exception e3) {
                            j2h1.h(exc, e3);
                            throw exc;
                        }
                    }
                }
                hm5.M(obj);
                ContentResolver contentResolver3 = gyaVar.a.getApplicationContext().getContentResolver();
                contentResolver3.getClass();
                Uri uriB = gya.b(contentResolver3, (ContentValues) obj4);
                if (uriB != null) {
                    Bitmap bitmap = (Bitmap) obj3;
                    try {
                        mjv mjvVar = gyaVar.f;
                        OutputStream outputStreamOpenOutputStream = contentResolver3.openOutputStream(uriB);
                        this.c = contentResolver3;
                        this.d = uriB;
                        this.b = true;
                        Object objY2 = fn31.Y((q8n) mjvVar.b, new y160(outputStreamOpenOutputStream, bitmap, (lnm) null, (byte) 6), this);
                        if (objY2 == d9nVar) {
                            obj2 = objY2;
                        }
                        return obj2 == d9nVar ? d9nVar : uriB;
                    } catch (Exception e4) {
                        exc = e4;
                        contentResolver = contentResolver3;
                        uri = uriB;
                        contentResolver.delete(uri, null, null);
                        throw exc;
                    }
                }
                return null;
            case 11:
                ven0 ven0Var3 = (ven0) this.c;
                ven0 ven0Var4 = (ven0) obj5;
                hm5.M(obj);
                if (this.b) {
                    ((ven0) this.d).setValue((md80) ven0Var3.getValue());
                    zxc0 zxc0Var2 = (md80) ven0Var3.getValue();
                    if (zxc0Var2 != null) {
                        zxc0Var = ((Boolean) ven0Var4.getValue()).booleanValue() ? null : zxc0Var2;
                        if (zxc0Var != null) {
                            ((iu30) obj4).invoke(new fg80((at80) obj3, zxc0Var));
                            ven0Var4.setValue(Boolean.TRUE);
                        }
                    }
                } else {
                    ven0Var4.setValue(Boolean.FALSE);
                }
                return obj2;
            case 12:
                a5c a5cVar = (a5c) this.c;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    rgb rgbVar = new rgb(new ht20(a5cVar.f.k((String) obj4, (trc0) this.d), new x4c(a5cVar, (String) obj4, (Set) obj5, (String) obj3, (lnm) null)), (byte) 1);
                    this.b = true;
                    objI = b5p1.i(rgbVar, this);
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objI = obj;
                }
                return ((py21) objI).d();
            case 13:
                ven0 ven0Var5 = (ven0) obj3;
                boolean z13 = this.b;
                try {
                    if (!z13) {
                        hm5.M(obj);
                        try {
                            mdd0 mdd0Var = ((mmf) obj5).e;
                            this.c = ven0Var5;
                            this.d = ven0Var5;
                            this.b = true;
                            objC = mdd0Var.c((String) obj4, this);
                            if (objC == d9nVar) {
                                return d9nVar;
                            }
                            ven0Var = ven0Var5;
                            ven0Var2 = ven0Var;
                            sn7Var = (sn7) objC;
                            if (sn7Var != null) {
                                zBooleanValue = true;
                            }
                        } catch (Exception unused) {
                            ven0Var = ven0Var5;
                            zBooleanValue = ((Boolean) ven0Var5.getValue()).booleanValue();
                            ven0Var.setValue(Boolean.valueOf(zBooleanValue));
                            return obj2;
                        }
                    } else {
                        if (!z13) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ven0 ven0Var6 = (ven0) this.d;
                        ven0Var = (ven0) this.c;
                        try {
                            hm5.M(obj);
                            ven0Var2 = ven0Var;
                            ven0Var = ven0Var6;
                            objC = obj;
                            try {
                                sn7Var = (sn7) objC;
                                if (sn7Var != null && !sn7Var.b) {
                                    zBooleanValue = true;
                                }
                            } catch (Exception unused2) {
                                ven0Var = ven0Var2;
                                zBooleanValue = ((Boolean) ven0Var5.getValue()).booleanValue();
                            }
                        } catch (Exception unused3) {
                            zBooleanValue = ((Boolean) ven0Var5.getValue()).booleanValue();
                            ven0Var.setValue(Boolean.valueOf(zBooleanValue));
                            return obj2;
                        }
                    }
                    ven0Var.setValue(Boolean.valueOf(zBooleanValue));
                    return obj2;
                } catch (CancellationException e5) {
                    throw e5;
                }
            case 14:
                String str3 = (String) this.d;
                p4h p4hVar = (p4h) this.c;
                boolean z14 = this.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zxc0 zxc0VarA = ((e4h) p4hVar.b.get()).a((String) obj4);
                zxc0Var = zxc0VarA instanceof e4a ? (e4a) zxc0VarA : null;
                if (zxc0Var != null) {
                    zxc0Var.b(str3);
                }
                r5s r5sVar = (r5s) p4hVar.c.get();
                String str4 = (String) obj5;
                String str5 = (String) obj3;
                this.b = true;
                if (str4.length() > 0 && !u890.j(str3, str4)) {
                    objE = r5sVar.a.e(str3, str4, str5, this);
                    if (objE != d9nVar) {
                    }
                    if (objE == d9nVar) {
                        return d9nVar;
                    }
                    return obj2;
                }
                n57.e("banInContext should be used for banning on a given context, if you need a global ban, use banGlobally instead, itemUri " + str3 + ",contextUri: " + str4);
                objE = obj2;
                if (objE == d9nVar) {
                    return d9nVar;
                }
                return obj2;
            case 15:
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    this.b = true;
                    return ((ghl) this.c).a.I((List) this.d, (String) obj5, (gj3) obj3, this) == d9nVar ? d9nVar : obj2;
                }
                if (z15) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 16:
                r1c0 r1c0Var = (r1c0) this.c;
                boolean z16 = this.b;
                try {
                    if (!z16) {
                        hm5.M(obj);
                        m441 m441VarQ = rwq.q(new e45((ven0) this.d, (byte) 3));
                        u60 u60Var = new u60(r1c0Var, (z8e1) obj5, (x6e1) obj4, (x180) obj3, (byte) 15);
                        this.b = true;
                        if (m441VarQ.collect(u60Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z16) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    eko1.t(r1c0Var);
                    return obj2;
                } catch (Throwable th2) {
                    eko1.t(r1c0Var);
                    throw th2;
                }
            case 17:
                boolean z17 = this.b;
                if (z17) {
                    if (z17) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                j5c j5cVar = (j5c) this.c;
                c8e1 c8e1Var = (c8e1) this.d;
                uu0 uu0Var = ((r1c0) obj5).a;
                y9e1 y9e1Var = ((z9e1) obj4).a;
                this.b = true;
                int iO = ((hyp0) obj3).o(nbe1.f(c8e1Var.b));
                if (iO < y9e1Var.a.a.b.length()) {
                    n511VarB = y9e1Var.b(iO);
                } else {
                    n511VarB = iO != 0 ? y9e1Var.b(iO - 1) : new n511(0.0f, 0.0f, 1.0f, (int) (e5e1.a((lee1) uu0Var.c, (wat) uu0Var.d, (f930) uu0Var.e) & 4294967295L));
                }
                Object objA5 = j5cVar.a(n511VarB, this);
                if (objA5 != d9nVar) {
                    objA5 = obj2;
                }
                return objA5 == d9nVar ? d9nVar : obj2;
            case 18:
                res resVar = (res) this.c;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                kge kgeVarB = ((oud) resVar.g).b();
                d9l d9lVar = new d9l((iu30) this.d, (xwa) obj5, (xwa) obj4, (xwa) obj3, resVar, (byte) 2);
                this.b = true;
                return kgeVarB.collect(d9lVar, this) == d9nVar ? d9nVar : obj2;
            case 19:
                k1r k1rVar = (k1r) this.d;
                boolean z19 = this.b;
                if (z19) {
                    if (z19) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                k1rVar.getClass();
                if (k1rVar instanceof j1r) {
                    return obj2;
                }
                try {
                    Object objK2 = u890.k(k1rVar, (d0r) this.c, (n4r) obj5);
                    this.d = null;
                    this.b = true;
                    return ((vr20) obj3).emit(objK2, this) == d9nVar ? d9nVar : obj2;
                } catch (Throwable th3) {
                    o3r o3rVar = (o3r) obj4;
                    if (th3 instanceof CancellationException) {
                        throw th3;
                    }
                    j2h1.h(th3, new DataStatementCrashContext("DataStatement: " + o3rVar));
                    throw th3;
                }
            case 20:
                n4r n4rVar = (n4r) obj4;
                vr20 vr20Var = (vr20) this.d;
                boolean z20 = this.b;
                try {
                    if (!z20) {
                        hm5.M(obj);
                        c0rVarC = ((d0r) obj5).c(n4rVar);
                        ien0 ien0VarA = c0rVarC.a();
                        el0 el0Var = new el0(obj5, (Object) n4rVar, obj3, (Object) vr20Var, (lnm) null, (byte) 19);
                        this.d = null;
                        this.c = c0rVarC;
                        this.b = true;
                        ien0VarA.b(el0Var, this);
                        obj2 = d9nVar;
                    } else {
                        if (!z20) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c0rVarC = (c0r) this.c;
                        hm5.M(obj);
                        c0rVarC.dispose();
                    }
                    return obj2;
                } catch (Throwable th4) {
                    c0rVarC.dispose();
                    throw th4;
                }
            case 21:
                boolean z21 = this.b;
                try {
                    if (!z21) {
                        hm5.M(obj);
                        String str6 = (String) obj4;
                        String str7 = (String) obj5;
                        String str8 = (String) obj3;
                        r5h r5hVar = (r5h) ((zfr) this.c).b;
                        d4a d4aVarN = BanInPlayContextRequest.n();
                        d4aVarN.q(str6);
                        d4aVarN.r(str7);
                        d4aVarN.n(str8);
                        Single map = r5hVar.callSingle("spotify.collection_esperanto.proto.CollectionService", "BanInPlayContext", d4aVarN.build()).map(uml1.P0).map(uwg.Y0);
                        this.d = null;
                        this.b = true;
                        objJ = fc11.j(map, this);
                        if (objJ == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z21) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ = obj;
                    }
                    m231Var = (Integer) objJ;
                    break;
                } catch (Throwable th5) {
                    m231Var = new m231(th5);
                }
                if (e331.a(m231Var) != null) {
                    m231Var = new Integer(500);
                }
                int iIntValue = m231Var.intValue();
                tr80 tr80Var = s4a.a;
                return (iIntValue > ((rr80) tr80Var).b || ((rr80) tr80Var).a > iIntValue) ? p4a.a : q4a.a;
            case 22:
                boolean z22 = this.b;
                if (!z22) {
                    hm5.M(obj);
                    qor qorVar = (qor) this.c;
                    nqs nqsVar = (nqs) this.d;
                    t6l t6lVar = (t6l) obj5;
                    m6l m6lVar = (m6l) obj4;
                    Long l = (Long) obj3;
                    if (m6lVar instanceof l6l) {
                        z2j0Var = new b3j0(true);
                    } else if (m6lVar instanceof k6l) {
                        z2j0Var = new z2j0(true);
                    } else {
                        eg.o();
                    }
                    d3j0 d3j0Var = new d3j0(z2j0Var, x2j0.a);
                    this.b = true;
                    return qorVar.b(nqsVar, t6lVar, m6lVar, l, d3j0Var, this) == d9nVar ? d9nVar : obj2;
                }
                if (z22) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 23:
                hm5.M(obj);
                lc20 lc20Var = (lc20) ((jnq) this.c).b;
                String str9 = (String) obj4;
                String str10 = (String) this.d;
                String str11 = (String) obj5;
                boolean z23 = this.b;
                Serializable serializable = (tv80) obj3;
                kly0 kly0Var = (kly0) lc20Var.d;
                if (!((Activity) kly0Var.get()).isDestroyed()) {
                    dwn0 dwn0Var = new dwn0(nik1.E1.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, serializable != null ? new bwn0(serializable) : null);
                    Bundle bundleF = pzm.f("item_uri", str9, "source_view_uri", str10);
                    bundleF.putString("source_context_uri", str11);
                    bundleF.putBoolean("is_item_being_curated", z23);
                    if (serializable != null) {
                        bundleF.putSerializable("interaction_logging_result", serializable);
                    }
                    lzn0 lzn0Var = (lzn0) lc20Var.b;
                    if (lzn0Var.j((Activity) kly0Var.get())) {
                        lzn0Var.i(dwn0Var, bundleF);
                    } else {
                        a1r0 a1r0Var = (a1r0) lc20Var.c;
                        if (serializable != null && (ou80Var = ((tv80) serializable).a) != null) {
                            zxc0Var = ou80Var.a;
                        }
                        a1r0.j(a1r0Var, dwn0Var.a, zxc0Var, bundleF, false, 8);
                    }
                }
                return obj2;
            case 24:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    xyc0 xyc0Var = (iyc0) ((tjq) this.c).a;
                    String str12 = (String) obj4;
                    List list = (List) this.d;
                    String str13 = (String) obj5;
                    tv80 tv80Var = (tv80) obj3;
                    zxc0Var = tv80Var != null ? new zxc0(tv80Var.a) : null;
                    this.b = true;
                    objE2 = xyc0Var.e(str12, list, "end", str13, "", zxc0Var, this);
                    if (objE2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objE2 = obj;
                }
                ((py21) objE2).d();
                return obj2;
            case 25:
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    this.b = true;
                    return ((fdc) this.c).L((String) obj4, (String) this.d, (ahh) obj5, (syf) obj3, this) == d9nVar ? d9nVar : obj2;
                }
                if (z25) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    this.b = true;
                    return ((fdc) this.c).L((String) obj4, (String) this.d, (Function0) obj5, (iu30) obj3, this) == d9nVar ? d9nVar : obj2;
                }
                if (z26) {
                    hm5.M(obj);
                    return obj2;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return e(obj);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                nsw0 nsw0Var = (nsw0) this.d;
                boolean z27 = this.b;
                if (!z27) {
                    hm5.M(obj);
                    sp00 sp00Var = ((z9y) obj5).i;
                    String str14 = ((u9y) obj4).a;
                    k1r k1rVar2 = (k1r) ((ven0) obj3).getValue();
                    this.d = null;
                    this.c = nsw0Var;
                    this.b = true;
                    objK = sp00Var.k(str14, k1rVar2, this);
                    if (objK == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z27) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nsw0Var = (nsw0) this.c;
                    hm5.M(obj);
                    objK = obj;
                }
                ((psw0) nsw0Var).setValue(new p020(objK));
                return obj2;
            default:
                boolean z28 = this.b;
                if (z28) {
                    if (z28) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                exy exyVar = (exy) this.c;
                if (!exyVar.d && (bwe1Var = exyVar.f) != null) {
                    zxc0Var = String.valueOf(bwe1Var.a);
                }
                this.b = true;
                Object objD = ((tq71) ((oey) this.d).b).d((String) obj4, (z771) obj5, (exy) this.c, zxc0Var, (il71) obj3, this);
                return objD == d9nVar ? d9nVar : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el0(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el0(Object obj, Object obj2, String str, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.f = str;
        this.e = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el0(Object obj, String str, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.f = str;
        this.d = obj2;
        this.e = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el0(Object obj, String str, String str2, String str3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.f = str;
        this.e = str2;
        this.g = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el0(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el0(xb10 xb10Var, li7 li7Var, yqi1 yqi1Var, q8n q8nVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 5;
        this.d = xb10Var;
        this.e = li7Var;
        this.f = yqi1Var;
        this.g = q8nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el0(boolean z, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, iu30 iu30Var, at80 at80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 11;
        this.b = z;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.f = iu30Var;
        this.g = at80Var;
    }
}
