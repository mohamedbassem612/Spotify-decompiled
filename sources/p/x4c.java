package p;

import android.content.BroadcastReceiver;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.spotify.assistedcuration.content.proto.AssistedCurationTracks;
import com.spotify.assistedcuration.content.proto.ReloadSignalPayload;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.StoryCard;
import io.reactivex.rxjava3.core.Completable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import kotlinx.coroutines.TimeoutCancellationException;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$ContentResumedEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x4c extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4c(wgm wgmVar, lik1 lik1Var, String str, tgm tgmVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 27;
        this.c = wgmVar;
        this.e = lik1Var;
        this.d = str;
        this.f = tgmVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:31:0x0105  */
    /* JADX WARN: Code duplicated, block: B:34:0x011e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0122  */
    private final Object e(Object obj) {
        ResumptionProgressEsperanto$ContentResumedEvent resumptionProgressEsperanto$ContentResumedEvent;
        PlayerState playerState;
        Object objO;
        String key;
        boolean zContains;
        kt91 kt91Var;
        Integer num;
        cg1 cg1Var;
        er91 er91Var;
        i5m i5mVar = (i5m) this.e;
        v1k v1kVar = i5mVar.a;
        f5m f5mVar = (f5m) this.d;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        if (!z) {
            hm5.M(obj);
            resumptionProgressEsperanto$ContentResumedEvent = f5mVar.a;
            Long l = i5mVar.g;
            if (l != null) {
                long jLongValue = l.longValue();
                if (resumptionProgressEsperanto$ContentResumedEvent.hasLastPlayedAt()) {
                    if (((Number) i5mVar.h.invoke()).longValue() - ((resumptionProgressEsperanto$ContentResumedEvent.p().q() * 1000) + ((long) (resumptionProgressEsperanto$ContentResumedEvent.p().p() / 1000000))) < jLongValue) {
                        ((bpb1) v1kVar.c).k(f5mVar, (Object) null);
                        return rih1Var;
                    }
                }
            }
            long jLongValue2 = 2000 - (((Number) i5mVar.f.invoke()).longValue() - f5mVar.b);
            if (jLongValue2 > 0) {
                hff hffVar = new hff(this.f, (Object) i5mVar, (Object) resumptionProgressEsperanto$ContentResumedEvent, lnmVar, (byte) 21);
                this.d = f5mVar;
                this.c = resumptionProgressEsperanto$ContentResumedEvent;
                this.b = true;
                objO = rc2.O(jLongValue2, hffVar, this);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                playerState = null;
            }
            ((bpb1) v1kVar.c).k(f5mVar, (Object) null);
            if (playerState != null && !u890.j(resumptionProgressEsperanto$ContentResumedEvent.getKey(), i5mVar.k)) {
                i5mVar.k = resumptionProgressEsperanto$ContentResumedEvent.getKey();
                key = resumptionProgressEsperanto$ContentResumedEvent.getKey();
                zContains = playerState.signals().contains("reshuffle");
                kt91Var = i5mVar.c;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954310});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                if (zContains) {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954310});
                    cg1Var = new cg1(i5mVar, key, (byte) 24);
                    num = 2131954309;
                } else {
                    num = null;
                    cg1Var = null;
                }
                er91Var = new er91((fs91) null, "", 2131954310, (String) null, num, cg1Var, (cvr) null, (xq91) null, false);
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                    return rih1Var;
                }
                kt91Var.o(er91Var);
            }
            return rih1Var;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResumptionProgressEsperanto$ContentResumedEvent resumptionProgressEsperanto$ContentResumedEvent2 = (ResumptionProgressEsperanto$ContentResumedEvent) this.c;
        hm5.M(obj);
        resumptionProgressEsperanto$ContentResumedEvent = resumptionProgressEsperanto$ContentResumedEvent2;
        objO = obj;
        playerState = (PlayerState) objO;
        ((bpb1) v1kVar.c).k(f5mVar, (Object) null);
        if (playerState != null) {
            i5mVar.k = resumptionProgressEsperanto$ContentResumedEvent.getKey();
            key = resumptionProgressEsperanto$ContentResumedEvent.getKey();
            zContains = playerState.signals().contains("reshuffle");
            kt91Var = i5mVar.c;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954310});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            if (zContains) {
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954310});
                cg1Var = new cg1(i5mVar, key, (byte) 24);
                num = 2131954309;
            } else {
                num = null;
                cg1Var = null;
            }
            er91Var = new er91((fs91) null, "", 2131954310, (String) null, num, cg1Var, (cvr) null, (xq91) null, false);
            if (kt91Var.g()) {
                kt91Var.k(er91Var);
                return rih1Var;
            }
            kt91Var.o(er91Var);
        }
        return rih1Var;
    }

    private final Object g(Object obj) {
        ugo0 ugo0VarE;
        wgm wgmVar = (wgm) this.c;
        tgm tgmVar = (tgm) this.f;
        boolean z = this.b;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        zqy zqyVar = (zqy) wgmVar.g.get();
        lik1 lik1Var = (lik1) this.e;
        String str = (String) this.d;
        String str2 = tgmVar.a;
        boolean z2 = tgmVar.f;
        c821 c821Var = tgmVar.v;
        boolean z3 = !tgmVar.m;
        boolean z4 = tgmVar.d;
        yh10 yh10Var = tgmVar.i;
        if (yh10Var != null) {
            ugo0VarE = yh10Var.d;
        } else {
            ugo0VarE = wgm.e(wgmVar, str, tgmVar.b, tgmVar.p, (String) null, (mgo0) null, 24);
        }
        wqy wqyVar = new wqy(str2, z2, true, true, z3, z4, false, tgmVar.w && wgmVar.g(), tgmVar.A, ugo0VarE, c821Var, tgmVar.x, (ok51) null, false, 12352);
        this.b = true;
        Object objA = zqyVar.a(lik1Var, str, wqyVar, this);
        d9n d9nVar = d9n.a;
        return objA == d9nVar ? d9nVar : objA;
    }

    private final Object h(Object obj) {
        Object next;
        psw0 psw0Var = (nsw0) this.c;
        boolean z = this.b;
        wm00 wm00Var = null;
        if (!z) {
            hm5.M(obj);
            ay8 ay8VarF = d3p1.F((d0r) this.e, ptm.a, (mqm) this.f);
            jte jteVar = new jte(2, (lnm) null, (byte) 6);
            this.c = psw0Var;
            this.b = true;
            obj = b5p1.j(ay8VarF, jteVar, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        Iterable iterable = (Iterable) ((k1r) obj).a;
        String str = (String) this.d;
        Iterator it = iterable.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((som) next).d, str));
        som somVar = (som) next;
        if (somVar != null) {
            mum mumVar = somVar.c;
            mum mumVar2 = mumVar instanceof mum ? mumVar : null;
            String str2 = mumVar2 != null ? mumVar2.c : null;
            if (str2 != null) {
                wm00Var = new wm00(str2, somVar.a);
            }
        }
        psw0Var.setValue(wm00Var);
        return rih1.a;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                return new x4c((a5c) this.c, (String) this.d, (Set) obj2, (String) obj3, lnmVar);
            case 1:
                return new x4c((nvc) this.c, (hvc) this.d, (Uri) obj3, (ParcelFileDescriptor[]) obj2, lnmVar, (byte) 1);
            case 2:
                return new x4c(this.d, obj3, obj2, lnmVar, (byte) 2);
            case 3:
                return new x4c((jkr0) this.c, (List) this.d, (vu30) obj3, (hdn0) obj2, lnmVar, (byte) 3);
            case 4:
                x4c x4cVar = new x4c(obj3, (String) this.d, obj2, lnmVar, (byte) 4);
                x4cVar.c = obj;
                return x4cVar;
            case 5:
                x4c x4cVar2 = new x4c(this.d, obj3, obj2, lnmVar, (byte) 5);
                x4cVar2.c = obj;
                return x4cVar2;
            case 6:
                return new x4c(obj3, (String) this.d, obj2, lnmVar, (byte) 6);
            case 7:
                return new x4c((xtb0) this.c, (ven0) this.d, (wpf) obj3, (iu30) obj2, lnmVar, (byte) 7);
            case 8:
                return new x4c((jkr0) this.c, (ven0) this.d, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 8);
            case 9:
                return new x4c(obj3, obj2, (String) this.d, lnmVar, (byte) 9);
            case 10:
                return new x4c((fmg) this.c, (tqw) this.d, (ven0) obj3, (ven0) obj2, lnmVar, (byte) 10);
            case 11:
                return new x4c((p4h) this.c, (String) this.d, (String) obj3, (String) obj2, lnmVar, (byte) 11);
            case 12:
                return new x4c((ven0) this.c, (List) this.d, (rph) obj3, (xtb0) obj2, lnmVar, (byte) 12);
            case 13:
                return new x4c(this.d, obj3, obj2, lnmVar, (byte) 13);
            case 14:
                return new x4c((List) this.c, (List) this.d, (List) obj3, (ven0) obj2, lnmVar, (byte) 14);
            case 15:
                return new x4c((xxj) this.c, (ScrollCaptureSession) this.d, (Rect) obj3, (Consumer) obj2, lnmVar, (byte) 15);
            case 16:
                return new x4c((k3k) this.c, (bju) obj3, (gw70) obj2, lnmVar);
            case 17:
                x4c x4cVar3 = new x4c(this.d, obj3, obj2, lnmVar, (byte) 17);
                x4cVar3.c = obj;
                return x4cVar3;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new x4c(obj3, obj2, (String) this.d, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                x4c x4cVar4 = new x4c(this.d, lnmVar, obj3, obj2, (byte) 19);
                x4cVar4.c = obj;
                return x4cVar4;
            case 20:
                x4c x4cVar5 = new x4c(this.d, lnmVar, obj3, obj2, (byte) 20);
                x4cVar5.c = obj;
                return x4cVar5;
            case 21:
                x4c x4cVar6 = new x4c(obj3, obj2, (String) this.d, lnmVar, (byte) 21);
                x4cVar6.c = obj;
                return x4cVar6;
            case 22:
                return new x4c((iac0) this.c, (iuk) obj3, (bs91) obj2, (String) this.d, lnmVar);
            case 23:
                return new x4c((cwh0) this.c, (vwl1) this.d, (AtomicInteger) obj3, (n8d0) obj2, lnmVar, (byte) 23);
            case 24:
                return new x4c((ConstraintTrackingWorker) this.c, (z8d0) this.d, (cwh0) obj3, (vwl1) obj2, lnmVar, (byte) 24);
            case 25:
                x4c x4cVar7 = new x4c((i5m) obj3, (ve01) obj2, lnmVar);
                x4cVar7.d = obj;
                return x4cVar7;
            case 26:
                x4c x4cVar8 = new x4c(this.d, lnmVar, obj3, obj2, (byte) 26);
                x4cVar8.c = obj;
                return x4cVar8;
            case 27:
                return new x4c((wgm) this.c, (lik1) obj3, (String) this.d, (tgm) obj2, lnmVar);
            case 28:
                x4c x4cVar9 = new x4c(obj3, obj2, (String) this.d, lnmVar, (byte) 28);
                x4cVar9.c = obj;
                return x4cVar9;
            default:
                x4c x4cVar10 = new x4c(this.d, obj3, obj2, lnmVar, (byte) 29);
                x4cVar10.c = obj;
                return x4cVar10;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((f5m) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v168, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v174 */
    /* JADX WARN: Type inference failed for: r0v233 */
    /* JADX WARN: Type inference failed for: r0v234 */
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objC;
        vkc0 vkc0Var;
        Object objY;
        m231 m231Var;
        ven0 ven0Var;
        Object objV;
        kj31 kj31Var;
        Object objA;
        Object objJ;
        wkt wktVar;
        Object objA2;
        Object objA3;
        String str;
        Object objC2;
        Object objU;
        Object objK;
        Object objA4;
        byte b = this.a;
        boolean zBooleanValue = false;
        m231 m231Var2 = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj2 = this.e;
        Object obj3 = this.f;
        e4a h9c1Var = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                a5c a5cVar = (a5c) this.c;
                String str2 = (String) this.d;
                this.b = true;
                int i = a5c.n;
                sg7 sg7VarO = AssistedCurationTracks.o();
                sg7VarO.q((String) obj2);
                sg7VarO.n((Set) obj3);
                AssistedCurationTracks assistedCurationTracks = (AssistedCurationTracks) sg7VarO.build();
                iyc0 iyc0Var = a5cVar.g;
                by11 by11VarN = ReloadSignalPayload.n();
                by11VarN.q();
                by11VarN.n(assistedCurationTracks);
                Object objA5 = iyc0.a(iyc0Var, str2, new ayc0("reload", (phc) null, ((ReloadSignalPayload) by11VarN.build()).toByteString(), false, (String) null, 26), this);
                if (objA5 != d9nVar) {
                    objA5 = m231Var2;
                }
                return objA5 == d9nVar ? d9nVar : m231Var2;
            case 1:
                Uri uri = (Uri) obj2;
                ParcelFileDescriptor[] parcelFileDescriptorArr = (ParcelFileDescriptor[]) obj3;
                nvc nvcVar = (nvc) this.c;
                lvc lvcVar = nvcVar.b;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        objC = obj;
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                vy70 vy70Var = new vy70(nvcVar.a);
                vy70Var.c = (hvc) this.d;
                zy70 zy70VarA = vy70Var.a();
                rf01 rf01Var = nvcVar.d;
                this.b = true;
                objC = rf01Var.c(zy70VarA, this);
                if (objC == d9nVar) {
                    return d9nVar;
                }
                viz vizVar = (iz70) objC;
                if (vizVar instanceof viz) {
                    String strM = l1d.m("Failed to generate image: ", vizVar.c.getMessage());
                    lvcVar.c(uri.toString(), strM);
                    parcelFileDescriptorArr[1].closeWithError(strM);
                    return m231Var2;
                }
                if (!(vizVar instanceof tsc1)) {
                    eg.o();
                    return null;
                }
                try {
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArr[1]);
                    try {
                        e4a e4aVar = ((tsc1) vizVar).a;
                        h9c1Var = e4aVar instanceof kxa ? (kxa) e4aVar : null;
                        if (h9c1Var != null) {
                            Bitmap bitmap = ((kxa) h9c1Var).a;
                            if (bitmap.isRecycled()) {
                                parcelFileDescriptorArr[1].closeWithError("Invalid bitmap result");
                            } else {
                                bitmap.compress(Bitmap.CompressFormat.PNG, 100, autoCloseOutputStream);
                            }
                        } else {
                            parcelFileDescriptorArr[1].closeWithError("Invalid bitmap result");
                        }
                        autoCloseOutputStream.close();
                        return m231Var2;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(autoCloseOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Exception e) {
                    lvcVar.c(uri.toString(), "Failed to write bitmap to pipe: " + e.getMessage());
                    try {
                        parcelFileDescriptorArr[1].closeWithError("Failed to write bitmap: " + e.getMessage());
                        return m231Var2;
                    } catch (Exception unused) {
                        return m231Var2;
                    }
                }
            case 2:
                vkc0 vkc0Var2 = (vkc0) obj2;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    klw0 klw0Var = (llw0) this.d;
                    if (!(klw0Var instanceof klw0)) {
                        if (klw0Var instanceof jlw0) {
                            return new g9c1(vkc0Var2.a, new bnt(((jlw0) klw0Var).a), (bnt) null, vkc0Var2.b, vkc0Var2.c, vkc0Var2.d, (o371) null, 64);
                        }
                        return null;
                    }
                    String str3 = vkc0Var2.a;
                    String str4 = vkc0Var2.b;
                    Map map = vkc0Var2.c;
                    o371 o371Var = vkc0Var2.e;
                    dqi1 dqi1Var = vkc0Var2.d;
                    vkc0Var = new vkc0(str3, str4, map, dqi1Var != null ? new dqi1(dqi1Var.a, dqi1Var.b, dqi1Var.c, dqi1Var.d, "canvas-v1") : new dqi1(15, (String) null, (String) null, (String) null, "canvas-v1"), o371Var);
                    lo71 lo71Var = (lo71) ((ic9) obj3).c;
                    String str5 = klw0Var.a;
                    this.c = vkc0Var;
                    this.b = true;
                    String lastPathSegment = Uri.parse(str5).getLastPathSegment();
                    if (lastPathSegment != null) {
                        objY = fn31.Y(lo71Var.c, new i3y0(lo71Var, str5, lo71Var.b.a(lastPathSegment), (lnm) null, (byte) 26), this);
                        if (objY == d9nVar) {
                            return d9nVar;
                        }
                        h9c1Var = new h9c1(vkc0Var.a, new cnt((Uri) objY, true), (bnt) null, vkc0Var.b, vkc0Var.c, vkc0Var.d, (o371) null, 64);
                    } else {
                        hhg1.n(l1d.m("Invalid videoUrl: ", str5));
                    }
                } else if (z3) {
                    vkc0 vkc0Var3 = (vkc0) this.c;
                    hm5.M(obj);
                    vkc0Var = vkc0Var3;
                    objY = obj;
                    h9c1Var = new h9c1(vkc0Var.a, new cnt((Uri) objY, true), (bnt) null, vkc0Var.b, vkc0Var.c, vkc0Var.d, (o371) null, 64);
                } else {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return h9c1Var;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU = rqt0.u(rwq.q(new of((jkr0) this.c, (byte) 4)));
                h50 h50Var = new h50((List) this.d, (vu30) obj2, (hdn0) obj3, (byte) 17);
                this.b = true;
                return mr20VarU.collect(h50Var, this) == d9nVar ? d9nVar : m231Var2;
            case 4:
                fta ftaVar = (fta) obj2;
                boolean z5 = this.b;
                try {
                    if (!z5) {
                        hm5.M(obj);
                        Completable completableA = ((hae) ftaVar.d).a(new c2b((String) this.d));
                        this.c = null;
                        this.b = true;
                        if (fc11.i(completableA, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z5) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    m231Var = m231Var2;
                    break;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th3) {
                    m231Var = new m231(th3);
                }
                tv80 tv80Var = (tv80) obj3;
                if (!(m231Var instanceof m231)) {
                    ((lzn0) ftaVar.e).a(nik1.z0.a, tv80Var, (Bundle) null);
                }
                Throwable thA = e331.a(m231Var);
                if (thA == null) {
                    return m231Var2;
                }
                Logger.e(thA, "Error when trying to leave Celebrity Blend", new Object[0]);
                kt91 kt91Var = (kt91) ftaVar.b;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953508});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131953508, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return m231Var2;
            case 5:
                vr20 vr20Var = (vr20) this.c;
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = (mr20) obj2;
                d18 d18Var = (d18) obj3;
                bge bgeVarG = h4p1.g(new p18(d18Var.a, new mgb(mr20Var, d18Var, (byte) 21), mr20Var, (skd0) this.d, (lnm) null, (byte) 4));
                this.c = null;
                this.b = true;
                return l4p1.s(vr20Var, bgeVarG, this) == d9nVar ? d9nVar : m231Var2;
            case 6:
                boolean z7 = this.b;
                try {
                    if (!z7) {
                        hm5.M(obj);
                        ven0Var = (ven0) obj3;
                        bfd bfdVar = ((mmf) obj2).c;
                        String str6 = (String) this.d;
                        this.c = ven0Var;
                        this.b = true;
                        objV = bfdVar.b.v(str6, this);
                        if (objV == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z7) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ven0Var = (ven0) this.c;
                        hm5.M(obj);
                        objV = obj;
                    }
                    Boolean bool = (Boolean) objV;
                    bool.getClass();
                    ven0Var.setValue(bool);
                    return m231Var2;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception unused2) {
                    return m231Var2;
                }
            case 7:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU2 = rqt0.u(rwq.q(new w77((xtb0) this.c, (ven0) this.d, (byte) 1)));
                qv7 qv7Var = new qv7((iu30) obj3, (byte) 5);
                this.b = true;
                Object objCollect = mr20VarU2.collect(new g4c(qv7Var, (wpf) obj2, (byte) 14), this);
                if (objCollect != d9nVar) {
                    objCollect = m231Var2;
                }
                return objCollect == d9nVar ? d9nVar : m231Var2;
            case 8:
                boolean z9 = this.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarU3 = rqt0.u(rwq.q(new of((jkr0) this.c, (byte) 6)));
                lqf lqfVar = new lqf((ven0) this.d, (ven0) obj2, (ven0) obj3, (byte) 0);
                this.b = true;
                return mr20VarU3.collect(lqfVar, this) == d9nVar ? d9nVar : m231Var2;
            case 9:
                String str7 = (String) this.d;
                boolean z10 = this.b;
                try {
                    if (!z10) {
                        hm5.M(obj);
                        kj31Var = (kj31) obj2;
                        ico0 ico0Var = ico0.b;
                        this.c = kj31Var;
                        this.b = true;
                        objA = ((ti31) obj3).a(str7, ico0Var, b7x.a, this);
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z10) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kj31Var = (kj31) this.c;
                        hm5.M(obj);
                        objA = obj;
                    }
                    return kj31Var.a((oi31) objA);
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception e5) {
                    n57.s("Failed to load the highlighted chip's artwork from " + str7 + ": " + e5);
                }
                break;
            case 10:
                ven0 ven0Var2 = (ven0) obj2;
                boolean z11 = this.b;
                if (!z11) {
                    hm5.M(obj);
                    if (!((amg) ven0Var2.getValue()).f) {
                        fmg fmgVar = (fmg) this.c;
                        String str8 = ((amg) ven0Var2.getValue()).a;
                        cmg cmgVar = ((amg) ven0Var2.getValue()).b;
                        if (((amg) ven0Var2.getValue()).c && ((Boolean) ((ven0) obj3).getValue()).booleanValue()) {
                            zBooleanValue = true;
                        }
                        tqw tqwVar = (tqw) this.d;
                        h9c1Var = tqwVar != null ? n3o1.y(tqwVar) : null;
                        this.b = true;
                        objJ = fmgVar.j(str8, cmgVar, zBooleanValue, h9c1Var, this);
                        if (objJ == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return Boolean.valueOf(zBooleanValue);
                }
                if (!z11) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                objJ = obj;
                zBooleanValue = ((Boolean) objJ).booleanValue();
                return Boolean.valueOf(zBooleanValue);
            case 11:
                String str9 = (String) obj2;
                p4h p4hVar = (p4h) this.c;
                boolean z12 = this.b;
                if (z12) {
                    if (z12) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                e4a e4aVarA = ((e4h) p4hVar.b.get()).a((String) this.d);
                h9c1Var = e4aVarA instanceof e4a ? e4aVarA : null;
                if (h9c1Var != null) {
                    h9c1Var.b(str9);
                }
                this.b = true;
                return ((r5s) p4hVar.c.get()).a(str9, (String) obj3, this) == d9nVar ? d9nVar : m231Var2;
            case 12:
                List list = (List) this.d;
                ven0 ven0Var3 = (ven0) this.c;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List list2 = (List) ven0Var3.getValue();
                ven0Var3.setValue(list);
                if (list == null || list2 == null || list.equals(list2)) {
                    return m231Var2;
                }
                rph rphVar = (rph) obj2;
                ebe0 ebe0Var = rphVar.b;
                if (!(ebe0Var instanceof ebe0) || ((ijh) ebe0Var.a).c != 1) {
                    return m231Var2;
                }
                String str10 = rphVar.k;
                if (str10 != null && str10.length() != 0) {
                    return m231Var2;
                }
                this.b = true;
                df41 df41Var = xtb0.y;
                return ((xtb0) obj3).k(0, 0, this) == d9nVar ? d9nVar : m231Var2;
            case 13:
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    wktVar = ((m4) this.d).i;
                    if (wktVar == null) {
                        return m231Var2;
                    }
                    vwa[] vwaVarArr = {new vwa()};
                    this.c = wktVar;
                    this.b = true;
                    objA2 = ((xwa) obj2).a(vwaVarArr, this);
                    if (objA2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wktVar = (wkt) this.c;
                    hm5.M(obj);
                    objA2 = obj;
                }
                ((iu30) obj3).invoke(new h4(((wwa) o7h.V0((List) objA2)).b, wktVar));
                return m231Var2;
            case 14:
                ven0 ven0Var4 = (ven0) obj3;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    if (((List) this.c) != null && ((List) this.d) != null && ((List) obj2) != null) {
                        ven0Var4.setValue(Boolean.FALSE);
                        return m231Var2;
                    }
                    this.b = true;
                    if (hap1.i(500L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ven0Var4.setValue(Boolean.TRUE);
                return m231Var2;
            case 15:
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    xxj xxjVar = (xxj) this.c;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.d;
                    Rect rect = (Rect) obj2;
                    ur80 ur80Var = new ur80(rect.left, rect.top, rect.right, rect.bottom);
                    this.b = true;
                    objA3 = xxjVar.a(scrollCaptureSession, ur80Var, this);
                    if (objA3 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA3 = obj;
                }
                ((Consumer) obj3).accept(l0p1.t((ur80) objA3));
                return m231Var2;
            case 16:
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    k3k k3kVar = (k3k) this.c;
                    str = k3kVar.a;
                    String str11 = k3kVar.b;
                    i24 i24Var = new i24(k3kVar, (gw70) obj3, (lnm) null, (byte) 19);
                    this.d = str;
                    this.b = true;
                    objC2 = ((bju) obj2).c(str11, i24Var, this);
                    if (objC2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str12 = (String) this.d;
                    hm5.M(obj);
                    str = str12;
                    objC2 = obj;
                }
                return new mmr0(str, objC2);
            case 17:
                c9n c9nVar = (c9n) this.c;
                boolean z18 = this.b;
                if (!z18) {
                    hm5.M(obj);
                    k3k[] k3kVarArr = (k3k[]) this.d;
                    bju bjuVar = (bju) obj2;
                    gw70 gw70Var = (gw70) obj3;
                    ArrayList arrayList = new ArrayList(k3kVarArr.length);
                    for (k3k k3kVar2 : k3kVarArr) {
                        arrayList.add(fn31.q(c9nVar, (o8n) null, 0, new x4c(k3kVar2, bjuVar, gw70Var, null), 3));
                    }
                    this.c = null;
                    this.b = true;
                    objU = o1p1.u(arrayList, this);
                    if (objU == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z18) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                return new l3k(sqg0.T((Iterable) objU));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                lak lakVar = (lak) obj2;
                p811 p811Var = this.b;
                try {
                    if (p811Var == 0) {
                        p811 p811VarU = cy30.u(obj);
                        jak jakVar = new jak(new fu20(o4p1.r(yoi1.g(lakVar.g.b((oi) obj3)), lakVar.h), new hak(p811VarU, null, (byte) 0), (byte) 1), (String) this.d, (byte) 0);
                        ytw0 ytw0Var = jfv.b;
                        huz huzVarW = r4p1.w(jakVar, fdg1.k0(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, ngv.d));
                        this.c = p811VarU;
                        this.b = true;
                        objK = b5p1.k(huzVarW, this);
                        p811Var = p811VarU;
                        if (objK == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (p811Var != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p811 p811Var2 = (p811) this.c;
                        hm5.M(obj);
                        objK = obj;
                        p811Var = p811Var2;
                    }
                    return (uv00) objK;
                } catch (Exception unused3) {
                } catch (TimeoutCancellationException unused4) {
                    return (uv00) p811Var.a;
                } catch (CancellationException e6) {
                    throw e6;
                }
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    if (this.d == null) {
                        this.c = null;
                        this.b = true;
                        fns fnsVar = igu.a;
                        Object objY2 = fn31.Y(pyf0.a, new zti((g341) obj3, (ero) obj2, (lnm) null, (byte) 6), this);
                        if (objY2 != d9nVar) {
                            objY2 = m231Var2;
                        }
                        return objY2 == d9nVar ? d9nVar : m231Var2;
                    }
                    bhn0.d();
                } else {
                    if (z19) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 20:
                boolean z20 = this.b;
                if (z20) {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return m231Var2;
                }
                hm5.M(obj);
                bgk bgkVar = (bgk) this.d;
                fns fnsVar2 = igu.a;
                bs50 bs50Var = pyf0.a;
                hff hffVar = new hff((Object) bgkVar, obj2, obj3, (lnm) null, (byte) 16);
                this.c = null;
                this.b = true;
                return fn31.Y(bs50Var, hffVar, this) == d9nVar ? d9nVar : m231Var2;
            case 21:
                c9n c9nVar2 = (c9n) this.c;
                boolean z21 = this.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mfe mfeVar = ((iuk) obj2).g;
                h50 h50Var2 = new h50(c9nVar2, (bs91) obj3, (String) this.d, (byte) 26);
                this.c = null;
                this.b = true;
                return mfeVar.collect(h50Var2, this) == d9nVar ? d9nVar : m231Var2;
            case 22:
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x8c0 lifecycle = ((iac0) this.c).getLifecycle();
                x4c x4cVar = new x4c(obj2, obj3, (String) this.d, (lnm) null, (byte) 21);
                this.b = true;
                return z8p1.t(lifecycle, w8c0.d, x4cVar, this) == d9nVar ? d9nVar : m231Var2;
            case 23:
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    cwh0 cwh0Var = (cwh0) this.c;
                    vwl1 vwl1Var = (vwl1) this.d;
                    this.b = true;
                    objA4 = ajl.a(cwh0Var, vwl1Var, this);
                    if (objA4 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objA4 = obj;
                }
                ((AtomicInteger) obj2).set(((Number) objA4).intValue());
                ((n8d0) obj3).cancel(true);
                return m231Var2;
            case 24:
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    this.b = true;
                    Object objI = ((ConstraintTrackingWorker) this.c).i((z8d0) this.d, (cwh0) obj2, (vwl1) obj3, this);
                    return objI == d9nVar ? d9nVar : objI;
                }
                if (z24) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 25:
                return e(obj);
            case 26:
                vr20 vr20Var2 = (vr20) this.c;
                boolean z25 = this.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return m231Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ht20 ht20Var = (ht20) this.d;
                h50 h50Var3 = new h50((byte) 29, (idm) obj2, (wcm) obj3, vr20Var2);
                this.c = null;
                this.b = true;
                return ht20Var.collect(h50Var3, this) == d9nVar ? d9nVar : m231Var2;
            case 27:
                return g(obj);
            case 28:
                return h(obj);
            default:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj3;
                llm llmVar = (llm) obj2;
                boolean z26 = this.b;
                try {
                    try {
                        if (!z26) {
                            hm5.M(obj);
                            c9n c9nVar3 = (c9n) this.c;
                            vu30 vu30Var = (vu30) this.d;
                            this.b = true;
                            if (vu30Var.invoke(c9nVar3, this) == d9nVar) {
                                return d9nVar;
                            }
                        } else {
                            if (!z26) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                        }
                    } catch (Throwable th4) {
                        try {
                            pendingResult.finish();
                            break;
                        } catch (IllegalStateException unused5) {
                        }
                        throw th4;
                    }
                    break;
                } catch (CancellationException e7) {
                    try {
                        throw e7;
                    } catch (Throwable th5) {
                        smo1.p(llmVar, (CancellationException) null);
                        throw th5;
                    }
                } catch (Throwable unused6) {
                }
                smo1.p(llmVar, (CancellationException) null);
                try {
                    pendingResult.finish();
                    return m231Var2;
                } catch (IllegalStateException unused7) {
                    return m231Var2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4c(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4c(Object obj, Object obj2, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4c(Object obj, String str, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.d = str;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4c(Object obj, lnm lnmVar, Object obj2, Object obj3, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4c(a5c a5cVar, String str, Set set, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.c = a5cVar;
        this.d = str;
        this.f = set;
        this.e = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4c(k3k k3kVar, bju bjuVar, gw70 gw70Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 16;
        this.c = k3kVar;
        this.e = bjuVar;
        this.f = gw70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4c(i5m i5mVar, ve01 ve01Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 25;
        this.e = i5mVar;
        this.f = ve01Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4c(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4c(iac0 iac0Var, iuk iukVar, bs91 bs91Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 22;
        this.c = iac0Var;
        this.e = iukVar;
        this.f = bs91Var;
        this.d = str;
    }
}
