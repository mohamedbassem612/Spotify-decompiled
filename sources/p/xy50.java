package p;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xy50 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy50(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x0199  */
    @Override // p.iu30
    public final Object invoke(Object obj) {
        bp60 bp60Var;
        xe01 xe01VarB;
        m1q0 m1q0Var;
        Object obj2 = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                yd10 yd10Var = (yd10) obj;
                az50 az50Var = (az50) this.b;
                g3f1 g3f1Var = az50Var.Y;
                if (g3f1Var != null && yd10Var == yd10.a) {
                    az50Var.a.invoke(new ty50(g3f1Var.d, g3f1Var.c));
                }
                return rih1.a;
            case 1:
                ((ez20) obj).d(d9y0.j(new ft30((ao60) this.b, (byte) 4)));
                return rih1.a;
            case 2:
                fdc fdcVar = (fdc) this.b;
                tv80 tv80VarE = fdc.E(fdcVar);
                nyn1.Q(fdc.w(fdcVar), tv80VarE != null ? mqn1.L((String) null, tv80VarE.a) : jsn0.a);
                fdc.z(fdcVar).b(new gjt(fjt.a, null));
                return rih1.a;
            case 3:
                mlv0 mlv0Var = (mlv0) obj;
                th70 th70Var = (th70) this.b;
                ReentrantLock reentrantLock = th70Var.b;
                reentrantLock.lock();
                try {
                    th70Var.a = mlv0Var.b().a().contentDeliveryIOTransport();
                    return rih1.a;
                } finally {
                    reentrantLock.unlock();
                }
            case 4:
                lu70 lu70Var = (lu70) this.b;
                return lu70Var.c.a(new yt70(lu70Var.b));
            case 5:
                return ((wu70) this.b).f((hv70) obj);
            case 6:
                ky80 ky80Var = (ky80) obj;
                fq2 fq2Var = ((bz80) this.b).i;
                return new ly80(ky80Var.e(), ky80Var.h(), ky80Var.j(), ky80Var.g(), ky80Var.d(), ky80Var.n(), ky80Var.o(), ky80Var.m(), ky80Var.i(), ky80Var.c(), ky80Var.a(), ky80Var.b(), ky80Var.k(), (!ky80Var.m() || (bp60Var = (bp60) fq2Var.b0.getValue()) == null || (xe01VarB = bp60Var.b()) == null) ? null : (String) xe01VarB.a.getValue(), ky80Var.l(), ky80Var.m() ? bz80.e((jre) fq2Var.s.a.getValue()) : null);
            case 7:
                return ljo1.s((qvc0) obj, new mvc0((xrc0) this.b, (byte) 0));
            case 8:
                return new lo8((yyc0) this.b, (cir0) obj, (byte) 10);
            case 9:
                mrd0 mrd0Var = (mrd0) this.b;
                yqd0 yqd0VarB = ((r2t) obj).b();
                mrd0Var.g1.a(EmptyDisposable.a);
                yqd0 yqd0Var = mrd0Var.e1;
                mrd0Var.e1 = yqd0VarB;
                if (yqd0Var != null && yqd0Var != yqd0VarB) {
                    mrd0Var.R0.onNext(drd0.a);
                }
                Disposable disposableSubscribe = yqd0VarB.c().distinctUntilChanged().filter(eh10.X).subscribeOn(mrd0Var.g).observeOn(mrd0Var.f).subscribe((Consumer) new krd0(mrd0Var, (byte) 0));
                mrd0Var.U0.onNext(Boolean.valueOf(mrd0Var.V0 || !mrd0Var.P0));
                return new CompositeDisposable(disposableSubscribe, Observable.combineLatest((ObservableSource) yqd0VarB.c().distinctUntilChanged(), (ObservableSource) mrd0Var.U0.distinctUntilChanged(), (BiFunction) mi10.X).distinctUntilChanged().subscribeOn(mrd0Var.g).observeOn(mrd0Var.f).subscribe((Consumer) new krd0(mrd0Var, (byte) 1)), mrd0Var.R0.distinctUntilChanged().observeOn(mrd0Var.f).subscribe((Consumer) new w090(mrd0Var, yqd0VarB, (byte) 8)), Disposable.d(new wqd0(mrd0Var, (byte) 1)));
            case 10:
                return t220.a((t220) obj, 2, ((u200) this.b).a(), 1023);
            case 11:
                return this.b;
            case 12:
                cas casVar = (a7m0) obj;
                casVar.d = i0f0.b1;
                casVar.e = i0f0.c1;
                casVar.a(klf0.Z, klf0.N0);
                casVar.c = new qn(klf0.Y, (q8n) this.b, (byte) 7);
                casVar.a = ujf0.h;
                return rih1.a;
            case 13:
                return new k6r((f6h0) this.b, (byte) 23);
            case 14:
                return new f8f0(((wdi0) this.b).e.a(), (byte) 20);
            case 15:
                rgi0 rgi0Var = (rgi0) this.b;
                hs00 hs00Var = rgi0Var.i;
                ezc ezcVarG = hs00Var != null ? yoi1.g(hs00Var.d()) : null;
                ymd0 ymd0Var = rgi0Var.d;
                return ezcVarG != null ? h5p1.t(t5p1.i(ymd0Var), ezcVarG, new o30()) : new f8f0(t5p1.i(ymd0Var), (byte) 21);
            case 16:
                mmr0 mmr0Var = (mmr0) obj;
                ml5 ml5Var = ((pkc) this.b).a;
                gmc gmcVar = (gmc) mmr0Var.a;
                if (((a5j0) mmr0Var.b) instanceof y4j0) {
                    String str = gmcVar.b;
                    TriggerType triggerType = gmcVar.c;
                    plc plcVar = ml5Var.a;
                    if (triggerType != TriggerType.URI || !(plcVar instanceof nlc) || ihc1.h0(str, ((nlc) plcVar).a, false)) {
                        String str2 = gmcVar.b;
                        bmc bmcVar = ml5Var.b;
                        if (triggerType != TriggerType.PLAYBACK_STARTED || !(bmcVar instanceof zlc) || ihc1.h0(str2, ((zlc) bmcVar).a, false)) {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                String str3 = (String) obj;
                Object obj3 = ((p811) this.b).a;
                if (obj3 != null && ((Bundle) obj3).containsKey(str3)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                itn0 itn0Var = (itn0) this.b;
                jge jgeVarE = hu20.e(new r6k0((mr20) itn0Var.b.d.getValue(), (byte) 9), new i64((byte) 18));
                ve01 ve01Var = itn0Var.d.d;
                ssn0 ssn0Var = itn0.i;
                return h5p1.t(jgeVarE, i6p1.w(ve01Var, crn1.n(), w0n0.d), etn0.h);
            case 19:
                return obj == ((wdn0) this.b) ? "(this)" : String.valueOf(obj);
            case 20:
                vt9 vt9Var = (vt9) obj;
                r1q0 r1q0Var = (r1q0) this.b;
                n36 n36Var = r1q0Var.b;
                ListIterator listIterator = n36Var.listIterator(n36Var.b());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((m1q0) objPrevious).a) {
                        obj2 = objPrevious;
                        m1q0Var = (m1q0) obj2;
                        if (r1q0Var.c != null) {
                            r1q0Var.c();
                        }
                        r1q0Var.c = m1q0Var;
                        if (m1q0Var != null) {
                            m1q0Var.d(vt9Var);
                        }
                        return rih1.a;
                    }
                }
                m1q0Var = (m1q0) obj2;
                if (r1q0Var.c != null) {
                    r1q0Var.c();
                }
                r1q0Var.c = m1q0Var;
                if (m1q0Var != null) {
                    m1q0Var.d(vt9Var);
                }
                return rih1.a;
            case 21:
                Context context = (Context) obj;
                osm0 osm0VarJ = pbq.j((pbq) this.b);
                if (osm0VarJ != null) {
                    return new twm0(context, osm0VarJ.j);
                }
                u890.C("multiPlayer");
                throw null;
            case 22:
                return (View) this.b;
            case 23:
                FrameLayout frameLayout = new FrameLayout((Context) obj);
                air0 air0Var = (air0) this.b;
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setId(R.id.content);
                frameLayout.setBackground(new ColorDrawable(0));
                frameLayout.addView(air0Var.c());
                return frameLayout;
            case 24:
                ohr0 ohr0Var = (ohr0) this.b;
                ohr0Var.c.invoke(new shq0(ohr0Var, (xh0) obj, (byte) 11));
                return rih1.a;
            case 25:
                ((View) obj).setTag(((uk00) ((u9c) this.b).e).a, Boolean.TRUE);
                return rih1.a;
            case 26:
                ((fwv0) ((ynb0) this.b).get()).a();
                return rih1.a;
            case 27:
                return ((u2w0) this.b).b;
            case 28:
                return (l4h1) ((rbx0) this.b).c.get();
            default:
                return tmx0.a(((omx0) obj).c, ((anx0) this.b).e.a());
        }
    }
}
