package p;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encore.image.EncoreImageView;
import com.spotify.encoreconsumermobile.elements.badge.badgegroup.BadgeGroupView;
import com.spotify.encoreconsumermobile.elements.badge.video.VideoBadgeView;
import com.spotify.encoreconsumermobile.elements.clearbutton.ClearButtonView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.EncoreIconView;
import com.spotify.encoremobile.component.slottextview.EncoreSubtitleView;
import com.spotify.encoremobile.component.slottextview.EncoreTitleView;
import com.spotify.extendedmetadata.proto.BatchedExtensionResponse;
import com.spotify.messages.WorkoutSessionEnded;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableResumeNext;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yjq implements j1o0, asy, Function {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;

    public yjq(Context context) {
        this.a = (byte) 17;
        this.c = context;
        this.d = m(2131886103);
        this.b = m(2131886104);
        this.e = m(2131886109);
        jd11 jd11Var = rc11.a;
        this.f = sqg0.J(new mmr0[]{new mmr0(jd11Var.b(h1v.class), sqg0.J(new mmr0[]{new mmr0(jd11Var.b(k1v.class), m(2131886100)), new mmr0(jd11Var.b(n1v.class), m(2131886101))})), new mmr0(jd11Var.b(k1v.class), sqg0.J(new mmr0[]{new mmr0(jd11Var.b(h1v.class), m(2131886105)), new mmr0(jd11Var.b(i1v.class), m(2131886106)), new mmr0(jd11Var.b(l1v.class), m(2131886107))})), new mmr0(jd11Var.b(n1v.class), sqg0.J(new mmr0[]{new mmr0(jd11Var.b(h1v.class), m(2131886110)), new mmr0(jd11Var.b(k1v.class), m(2131886111)), new mmr0(jd11Var.b(l1v.class), m(2131886112))})), new mmr0(jd11Var.b(i1v.class), Collections.singletonMap(jd11Var.b(h1v.class), m(2131886102))), new mmr0(jd11Var.b(l1v.class), Collections.singletonMap(jd11Var.b(h1v.class), m(2131886108)))});
    }

    public static final hvc c(yjq yjqVar, aa51 aa51Var) {
        String str = aa51Var.d;
        String str2 = aa51Var.c;
        return str2.length() > 0 ? new gvc(12, str2, str) : new dvc(str, 2);
    }

    public static final y6x0 d(yjq yjqVar, aa51 aa51Var, z3p0 z3p0Var) {
        y6x0 y6x0Var = y6x0.T0;
        String str = aa51Var.d;
        if (!u890.j(str, z3p0Var != null ? z3p0Var.a : null)) {
            if (!u890.j(str, z3p0Var != null ? z3p0Var.b : null)) {
                return null;
            }
        }
        return y6x0Var;
    }

    public static yjq r(LayoutInflater layoutInflater, txy txyVar) {
        layoutInflater.inflate(2131624595, (ViewGroup) txyVar);
        int i = 2131427680;
        BadgeGroupView badgeGroupViewT = m5n1.t(txyVar, 2131427680);
        if (badgeGroupViewT != null) {
            i = 2131431037;
            VideoBadgeView videoBadgeViewT = m5n1.t(txyVar, 2131431037);
            if (videoBadgeViewT != null) {
                i = 2131431123;
                EncoreImageView encoreImageViewT = m5n1.t(txyVar, 2131431123);
                if (encoreImageViewT != null) {
                    i = 2131431129;
                    EncoreSubtitleView encoreSubtitleViewT = m5n1.t(txyVar, 2131431129);
                    if (encoreSubtitleViewT != null) {
                        return new yjq((Object) txyVar, (Object) badgeGroupViewT, (Object) videoBadgeViewT, (Object) encoreImageViewT, (Object) encoreSubtitleViewT, (byte) 24);
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(txyVar.getResources().getResourceName(i)));
        return null;
    }

    public static yjq s(LayoutInflater layoutInflater, kyy kyyVar) {
        layoutInflater.inflate(2131624598, (ViewGroup) kyyVar);
        int i = 2131429521;
        FrameLayout frameLayout = (FrameLayout) m5n1.t(kyyVar, 2131429521);
        if (frameLayout != null) {
            i = 2131431366;
            EncoreIconView encoreIconViewT = m5n1.t(kyyVar, 2131431366);
            if (encoreIconViewT != null) {
                i = 2131431367;
                EncoreIconView encoreIconViewT2 = m5n1.t(kyyVar, 2131431367);
                if (encoreIconViewT2 != null) {
                    i = 2131431385;
                    EncoreTitleView encoreTitleViewT = m5n1.t(kyyVar, 2131431385);
                    if (encoreTitleViewT != null) {
                        return new yjq((Object) kyyVar, (Object) frameLayout, (Object) encoreIconViewT, (Object) encoreIconViewT2, (Object) encoreTitleViewT, (byte) 25);
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(kyyVar.getResources().getResourceName(i)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(List list, gj3 gj3Var, onm onmVar) {
        dsr dsrVar;
        Completable completableIgnoreElement;
        if (onmVar instanceof dsr) {
            dsrVar = (dsr) onmVar;
            int i = dsrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dsrVar.c = i - Integer.MIN_VALUE;
            } else {
                dsrVar = new dsr(this, onmVar);
            }
        } else {
            dsrVar = new dsr(this, onmVar);
        }
        Object obj = dsrVar.a;
        int i2 = dsrVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            a680 a680Var = (a680) this.b;
            tv80 tv80Var = gj3Var.c;
            w4h w4hVar = (w4h) a680Var.b;
            Set set = s4b1.f;
            int iOrdinal = uic.x((String) o7h.q0(list)).c.ordinal();
            if (iOrdinal != 226 && iOrdinal != 229) {
                if (iOrdinal == 703) {
                    completableIgnoreElement = w4hVar.b(a680.D(list, w5h.d)).ignoreElement();
                } else if (iOrdinal == 844) {
                    completableIgnoreElement = j2h1.D((q8n) a680Var.f, new jmr(a680Var, list, tv80Var, (lnm) null, (byte) 1));
                } else if (iOrdinal != 860) {
                    completableIgnoreElement = iOrdinal != 967 ? ((r5h) a680Var.a).c(a680.E(list, tv80Var)).ignoreElement() : w4hVar.b(a680.D(list, w5h.c)).ignoreElement();
                } else {
                    completableIgnoreElement = ((p981) a680Var.d).b((String) o7h.q0(list)).flatMapCompletable(new kmr(a680Var, list, tv80Var, (byte) 1));
                }
            }
            dsrVar.c = 1;
            Object objI = fc11.i(completableIgnoreElement, dsrVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return new lj3((dsa0) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(String str, List list, gj3 gj3Var, onm onmVar) {
        esr esrVar;
        if (onmVar instanceof esr) {
            esrVar = (esr) onmVar;
            int i = esrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                esrVar.c = i - Integer.MIN_VALUE;
            } else {
                esrVar = new esr(this, onmVar);
            }
        } else {
            esrVar = new esr(this, onmVar);
        }
        Object obj = esrVar.a;
        int i2 = esrVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            q8n q8nVar = (q8n) this.f;
            swn swnVar = new swn(this, str, list, gj3Var, (lnm) null, (byte) 8);
            esrVar.c = 1;
            Object objY = fn31.Y(q8nVar, swnVar, esrVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return new lj3((dsa0) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(List list, onm onmVar) {
        fsr fsrVar;
        if (onmVar instanceof fsr) {
            fsrVar = (fsr) onmVar;
            int i = fsrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fsrVar.c = i - Integer.MIN_VALUE;
            } else {
                fsrVar = new fsr(this, onmVar);
            }
        } else {
            fsrVar = new fsr(this, onmVar);
        }
        Object obj = fsrVar.a;
        int i2 = fsrVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            Completable completableC = hur.c(list, new eks((hur) this.d, (byte) 1));
            fsrVar.c = 1;
            Object objI = fc11.i(completableC, fsrVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return new lj3((dsa0) null);
    }

    public Object D(List list, onm onmVar) {
        return fn31.Y((q8n) this.d, new cvs(list, this, (lnm) null), onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(String str, onm onmVar) {
        npw npwVar;
        if (onmVar instanceof npw) {
            npwVar = (npw) onmVar;
            int i = npwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                npwVar.c = i - Integer.MIN_VALUE;
            } else {
                npwVar = new npw(this, onmVar);
            }
        } else {
            npwVar = new npw(this, onmVar);
        }
        Object objY = npwVar.a;
        int i2 = npwVar.c;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objY);
            q8n q8nVar = (q8n) this.e;
            p1r p1rVar = new p1r(this, str, lnmVar, (byte) 13);
            npwVar.c = 1;
            objY = fn31.Y(q8nVar, p1rVar, npwVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return objY;
    }

    public void F() {
        ((rku) this.f).b(((kor) this.d).f.filter(mm10.d1).map(ns80.a1).doOnNext(new cfs(this, (byte) 3)).subscribe());
    }

    public void G() {
        ((rku) this.f).a();
    }

    public nj3 H(boolean z) {
        qut0 qut0Var = (qut0) this.e;
        boolean z2 = !z;
        hma1 hma1VarEdit = ((dma1) qut0Var.a.get()).edit();
        hma1VarEdit.a(qut0.d, z2);
        hma1VarEdit.g();
        ((BehaviorSubject) qut0Var.c.getValue()).onNext(Boolean.valueOf(z2));
        return z ? new lj3(hj3.d) : new kj3(hj3.c);
    }

    public Object I(List list, String str, gj3 gj3Var, a8d1 a8d1Var) {
        qut0 qut0Var = (qut0) this.e;
        if (list.isEmpty()) {
            hhg1.n("Failed requirement.");
            return null;
        }
        String str2 = (String) o7h.q0(list);
        ((upp0) qut0Var.b.get()).getClass();
        boolean zB = upp0.b(str2);
        rih1 rih1Var = rih1.a;
        if (zB) {
            hma1 hma1VarEdit = ((dma1) qut0Var.a.get()).edit();
            hma1VarEdit.a(qut0.d, false);
            hma1VarEdit.g();
            ((BehaviorSubject) qut0Var.c.getValue()).onNext(Boolean.FALSE);
            return rih1Var;
        }
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x((String) o7h.q0(list));
        v5b1 v5b1Var = s4b1VarX.d;
        b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
        boolean zJ = u890.j(type, nyu0.e);
        d9n d9nVar = d9n.a;
        if (zJ || u890.j(type, wyu0.f)) {
            Object objC = C(list, a8d1Var);
            if (objC == d9nVar) {
                return objC;
            }
        } else {
            if (xrr.a[s4b1VarX.c.ordinal()] == 1) {
                Object objB = B(str, list, gj3Var, a8d1Var);
                if (objB == d9nVar) {
                    return objB;
                }
            } else {
                Object objA = A(list, gj3Var, a8d1Var);
                if (objA == d9nVar) {
                    return objA;
                }
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object J(onm onmVar) {
        j7u j7uVar;
        if (onmVar instanceof j7u) {
            j7uVar = (j7u) onmVar;
            int i = j7uVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7uVar.c = i - Integer.MIN_VALUE;
            } else {
                j7uVar = new j7u(this, onmVar);
            }
        } else {
            j7uVar = new j7u(this, onmVar);
        }
        Object objI = j7uVar.a;
        int i2 = j7uVar.c;
        if (i2 == 0) {
            hm5.M(objI);
            pzs pzsVar = (pzs) this.f;
            j7uVar.c = 1;
            objI = b5p1.i(pzsVar, j7uVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        long jB = ((yqg) this.b).b();
        hma1 hma1VarEdit = ((dma1) objI).edit();
        hma1VarEdit.c((bma1) this.e, jB);
        hma1VarEdit.h();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, tv80 tv80Var, lnm lnmVar) {
        bsy bsyVar;
        if (lnmVar instanceof bsy) {
            bsyVar = (bsy) lnmVar;
            int i = bsyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bsyVar.c = i - Integer.MIN_VALUE;
            } else {
                bsyVar = new bsy(this, (onm) lnmVar);
            }
        } else {
            bsyVar = new bsy(this, (onm) lnmVar);
        }
        Object obj = bsyVar.a;
        int i2 = bsyVar.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(obj);
            zry zryVar = (zry) ((xe01) this.f).a.getValue();
            if (zryVar instanceof xry) {
                vb2.b((vb2) this.e, new db2(((xry) zryVar).a), true, tv80Var);
            } else if (u890.j(zryVar, ury.a)) {
                ((yh2) this.b).b(str, (String) null);
            } else if (u890.j(zryVar, vry.a)) {
                bsyVar.c = 1;
                w390 w390Var = (w390) this.d;
                r6h1 r6h1Var = r6h1.c;
                Object objA = w390Var.a().a(bsyVar);
                d9n d9nVar = d9n.a;
                if (objA != d9nVar) {
                    objA = rih1.a;
                }
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else if (u890.j(zryVar, wry.a)) {
                ((y5v0) this.c).a(str, (String) null);
            } else {
                if (!u890.j(zryVar, yry.a)) {
                    eg.o();
                    return null;
                }
                z = false;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return Boolean.valueOf(z);
    }

    public Object apply(Object obj) {
        return ((z410) this.c).f.c((String) this.d, (PreparePlayOptions) obj, (PlayOrigin) this.b, (LoggingParams) this.e, (Map) this.f);
    }

    public Single b() {
        return ((p2o0) this.c).D().flatMap(new rmr(this, (byte) 20));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(List list, gj3 gj3Var, onm onmVar) {
        yrr yrrVar;
        Completable completableIgnoreElement;
        if (onmVar instanceof yrr) {
            yrrVar = (yrr) onmVar;
            int i = yrrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yrrVar.c = i - Integer.MIN_VALUE;
            } else {
                yrrVar = new yrr(this, onmVar);
            }
        } else {
            yrrVar = new yrr(this, onmVar);
        }
        Object obj = yrrVar.a;
        int i2 = yrrVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            a680 a680Var = (a680) this.b;
            tv80 tv80Var = gj3Var.c;
            w4h w4hVar = (w4h) a680Var.b;
            Set set = s4b1.f;
            int iOrdinal = uic.x((String) o7h.q0(list)).c.ordinal();
            if (iOrdinal != 226 && iOrdinal != 229) {
                if (iOrdinal == 703) {
                    completableIgnoreElement = w4hVar.a(a680.D(list, w5h.d)).ignoreElement();
                } else if (iOrdinal == 844) {
                    completableIgnoreElement = j2h1.D((q8n) a680Var.f, new jmr(a680Var, list, tv80Var, (lnm) null, (byte) 0));
                } else if (iOrdinal != 860) {
                    completableIgnoreElement = iOrdinal != 967 ? ((r5h) a680Var.a).a(a680.E(list, tv80Var)).ignoreElement() : w4hVar.a(a680.D(list, w5h.c)).ignoreElement();
                } else {
                    completableIgnoreElement = ((p981) a680Var.d).b((String) o7h.q0(list)).flatMapCompletable(new kmr(a680Var, list, tv80Var, (byte) 0));
                }
            }
            yrrVar.c = 1;
            Object objI = fc11.i(completableIgnoreElement, yrrVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return new kj3((dsa0) null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object f(String str, List list, String str2, String str3, gj3 gj3Var, onm onmVar) {
        zrr zrrVar;
        String str4;
        if (onmVar instanceof zrr) {
            zrrVar = (zrr) onmVar;
            int i = zrrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zrrVar.d = i - Integer.MIN_VALUE;
            } else {
                zrrVar = new zrr(this, onmVar);
            }
        } else {
            zrrVar = new zrr(this, onmVar);
        }
        zrr zrrVar2 = zrrVar;
        Object objY = zrrVar2.b;
        int i2 = zrrVar2.d;
        ij3 ij3Var = null;
        if (i2 == 0) {
            hm5.M(objY);
            q8n q8nVar = (q8n) this.f;
            af0 af0Var = new af0(this, str, list, str2, str3, gj3Var, (lnm) null, (byte) 8);
            zrrVar2.a = str;
            zrrVar2.d = 1;
            objY = fn31.Y(q8nVar, af0Var, zrrVar2);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
            str4 = str;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = zrrVar2.a;
            hm5.M(objY);
        }
        List list2 = (List) ((py21) objY).c();
        if (list2 != null) {
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                ij3Var = new ij3(str4, list2);
            }
        }
        return new kj3(ij3Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(List list, onm onmVar) {
        asr asrVar;
        if (onmVar instanceof asr) {
            asrVar = (asr) onmVar;
            int i = asrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                asrVar.c = i - Integer.MIN_VALUE;
            } else {
                asrVar = new asr(this, onmVar);
            }
        } else {
            asrVar = new asr(this, onmVar);
        }
        Object obj = asrVar.a;
        int i2 = asrVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            hur hurVar = (hur) this.d;
            mwm1 mwm1Var = (mwm1) hurVar.c;
            ssm1 ssm1VarQ = YourLibraryContainsRequest.q();
            ssm1VarQ.n(list);
            CompletableResumeNext completableResumeNextP = mwm1Var.a(ssm1VarQ.build()).flatMapCompletable(new zfr(hurVar, list, (byte) 20)).p(bya0.W0);
            asrVar.c = 1;
            Object objI = fc11.i(completableResumeNextP, asrVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return new kj3((dsa0) null);
    }

    public ioj0 h(BatchedExtensionResponse batchedExtensionResponse) {
        ioj0 ioj0VarP = f7p1.p(batchedExtensionResponse, (pv00) this.d);
        ((dv00) this.e).f(vyo1.C(ioj0VarP));
        return ioj0VarP;
    }

    public void i(n3d n3dVar, n3d n3dVar2, n3d1 n3d1Var, n3d1 n3d1Var2, Map.Entry entry) {
        n3d1 n3d1Var3 = (n3d1) entry.getValue();
        l29 l29Var = new l29(n3d1Var.g.a, ((p09) entry.getKey()).a.d, n3d1Var.c ? n3dVar : null, ((p09) entry.getKey()).a.f, ((p09) entry.getKey()).a.g);
        l29 l29Var2 = new l29(n3d1Var2.g.a, ((p09) entry.getKey()).b.d, n3d1Var2.c ? n3dVar2 : null, ((p09) entry.getKey()).b.f, ((p09) entry.getKey()).b.g);
        int i = ((p09) entry.getKey()).a.c;
        n3d1Var3.getClass();
        w8p1.m();
        n3d1Var3.a();
        o0c.q("Consumer can only be linked once.", !n3d1Var3.j);
        n3d1Var3.j = true;
        m3d1 m3d1Var = n3d1Var3.l;
        dce dceVarJ = poz0.J(m3d1Var.c(), new l3d1(n3d1Var3, m3d1Var, i, l29Var, l29Var2), x2g0.A());
        dceVarJ.b(new nx30(dceVarJ, new gmt(this, n3d1Var3), (byte) 0), x2g0.A());
    }

    public ll01 j() {
        nl01 nl01Var = (nl01) this.c;
        ml01 ml01Var = (ml01) this.d;
        yuj yujVar = (yuj) ml01Var.b.get();
        c8o.l(yujVar);
        q8n q8nVar = (q8n) ml01Var.a.get();
        c8o.l(q8nVar);
        RetrofitMaker retrofitMaker = (RetrofitMaker) ml01Var.c.get();
        c8o.l(retrofitMaker);
        mk01 mk01Var = new mk01(q8nVar, (pk01) retrofitMaker.createWebgateService(pk01.class, "android-campaigns-wrapped-receipt"));
        pl01 pl01Var = (pl01) ml01Var.d.get();
        c8o.l(pl01Var);
        tp41 tp41Var = (tp41) ml01Var.e.get();
        c8o.l(tp41Var);
        return new ll01(nl01Var, yujVar, mk01Var, pl01Var, tp41Var, xqu.a((jxp) this.f), (i4m0) ((jly0) this.b).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object k(List list, String str, String str2, boolean z, kio kioVar, gj3 gj3Var, onm onmVar) {
        bsr bsrVar;
        o8n o8nVar;
        if (onmVar instanceof bsr) {
            bsrVar = (bsr) onmVar;
            int i = bsrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bsrVar.d = i - Integer.MIN_VALUE;
            } else {
                bsrVar = new bsr(this, onmVar);
            }
        } else {
            bsrVar = new bsr(this, onmVar);
        }
        Object objY = bsrVar.b;
        int i2 = bsrVar.d;
        if (i2 == 0) {
            hm5.M(objY);
            if (list.isEmpty()) {
                hhg1.n("Failed requirement.");
                return null;
            }
            o8n context = bsrVar.getContext();
            op71.x(context);
            geo0 geo0Var = geo0.b;
            fx2 fx2Var = new fx2(this, list, z, str, str2, kioVar, gj3Var, context, (lnm) null);
            bsrVar.a = context;
            bsrVar.d = 1;
            objY = fn31.Y(geo0Var, fx2Var, bsrVar);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
            o8nVar = context;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o8nVar = bsrVar.a;
            hm5.M(objY);
        }
        nj3 nj3Var = (nj3) objY;
        op71.x(o8nVar);
        return nj3Var;
    }

    public String l() {
        return (String) ((idd1) this.f).getValue();
    }

    public idd1 m(int i) {
        return new idd1(new gf6(this, i, (byte) 4));
    }

    public cdf0 n(p1v p1vVar) {
        znb0 znb0Var;
        cdf0 cdf0Var;
        znb0 znb0Var2;
        cdf0 cdf0Var2;
        znb0 znb0Var3;
        cdf0 cdf0Var3;
        Map map = (Map) this.f;
        if ((p1vVar instanceof h1v) || (p1vVar instanceof f1v)) {
            jd11 jd11Var = rc11.a;
            Map map2 = (Map) map.get(jd11Var.b(h1v.class));
            if (map2 != null && (znb0Var = (znb0) map2.get(jd11Var.b(n1v.class))) != null && (cdf0Var = (cdf0) znb0Var.getValue()) != null) {
                cdf0Var.v(0.0f);
                return cdf0Var;
            }
        } else if (p1vVar instanceof i1v) {
            jd11 jd11Var2 = rc11.a;
            Map map3 = (Map) map.get(jd11Var2.b(i1v.class));
            if (map3 != null && (znb0Var3 = (znb0) map3.get(jd11Var2.b(h1v.class))) != null && (cdf0Var3 = (cdf0) znb0Var3.getValue()) != null) {
                cdf0Var3.v(0.0f);
                return cdf0Var3;
            }
        } else if (p1vVar instanceof l1v) {
            jd11 jd11Var3 = rc11.a;
            Map map4 = (Map) map.get(jd11Var3.b(l1v.class));
            if (map4 != null && (znb0Var2 = (znb0) map4.get(jd11Var3.b(h1v.class))) != null && (cdf0Var2 = (cdf0) znb0Var2.getValue()) != null) {
                cdf0Var2.v(0.0f);
                return cdf0Var2;
            }
        } else {
            if (p1vVar instanceof k1v) {
                Float f = ((k1v) p1vVar).a;
                if (f != null) {
                    cdf0 cdf0Var4 = (cdf0) ((idd1) this.d).getValue();
                    cdf0Var4.v(f.floatValue());
                    return cdf0Var4;
                }
                cdf0 cdf0Var5 = (cdf0) ((idd1) this.b).getValue();
                cdf0Var5.x(1);
                cdf0Var5.w(-1);
                cdf0Var5.k();
                return cdf0Var5;
            }
            if (p1vVar instanceof n1v) {
                cdf0 cdf0Var6 = (cdf0) ((idd1) this.e).getValue();
                cdf0Var6.x(1);
                cdf0Var6.w(-1);
                cdf0Var6.k();
                return cdf0Var6;
            }
            if (!p1vVar.equals(m1v.a)) {
                eg.o();
                return null;
            }
        }
        return null;
    }

    public View o() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 24:
                return (txy) obj;
            default:
                return (kyy) obj;
        }
    }

    public cdf0 p(p1v p1vVar, p1v p1vVar2, AnimatorListenerAdapter animatorListenerAdapter) {
        znb0 znb0Var;
        cdf0 cdf0Var;
        Map map = (Map) this.f;
        Class<?> cls = p1vVar.getClass();
        jd11 jd11Var = rc11.a;
        Map map2 = (Map) map.get(jd11Var.b(cls));
        if (map2 == null || (znb0Var = (znb0) map2.get(jd11Var.b(p1vVar2.getClass()))) == null || (cdf0Var = (cdf0) znb0Var.getValue()) == null) {
            return null;
        }
        cdf0Var.k();
        cdf0Var.b.addListener(animatorListenerAdapter);
        return cdf0Var;
    }

    public boolean q(p1v p1vVar, p1v p1vVar2) {
        Map map = (Map) this.f;
        Class<?> cls = p1vVar.getClass();
        jd11 jd11Var = rc11.a;
        Map map2 = (Map) map.get(jd11Var.b(cls));
        return (map2 != null ? (znb0) map2.get(jd11Var.b(p1vVar2.getClass())) : null) != null;
    }

    public v0d1 t(int i) {
        y7s x7sVar;
        HashMap map = (HashMap) this.d;
        v0d1 v0d1Var = (v0d1) map.get(Integer.valueOf(i));
        if (v0d1Var != null) {
            return v0d1Var;
        }
        final lbq lbqVar = (lbq) this.e;
        lbqVar.getClass();
        final byte b = 0;
        if (i != 0) {
            final byte b2 = 1;
            if (i != 1) {
                final byte b3 = 2;
                if (i == 2) {
                    final Class clsAsSubclass = HlsMediaSource.Factory.class.asSubclass(o2i0.class);
                    x7sVar = new v0d1() { // from class: p.w7s
                        public final Object get() {
                            switch (b3) {
                                case 0:
                                    break;
                                case 1:
                                    break;
                            }
                            return z7s.e(clsAsSubclass, lbqVar);
                        }
                    };
                } else if (i == 3) {
                    x7sVar = new x7s(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(o2i0.class), (byte) 0);
                } else {
                    if (i != 4) {
                        hhg1.n(f4i1.c(i, "Unrecognized contentType: "));
                        return null;
                    }
                    x7sVar = new y7s(this, lbqVar, (byte) 0);
                }
            } else {
                final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(o2i0.class);
                x7sVar = new v0d1() { // from class: p.w7s
                    public final Object get() {
                        switch (b2) {
                            case 0:
                                break;
                            case 1:
                                break;
                        }
                        return z7s.e(clsAsSubclass2, lbqVar);
                    }
                };
            }
        } else {
            final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(o2i0.class);
            x7sVar = new v0d1() { // from class: p.w7s
                public final Object get() {
                    switch (b) {
                        case 0:
                            break;
                        case 1:
                            break;
                    }
                    return z7s.e(clsAsSubclass3, lbqVar);
                }
            };
        }
        map.put(Integer.valueOf(i), x7sVar);
        return x7sVar;
    }

    public void u(wzl1 wzl1Var) {
        t1m1 t1m1Var;
        vi11 vi11Var = (vi11) this.d;
        AtomicReference atomicReference = (AtomicReference) this.f;
        String str = wzl1Var.a;
        if (u890.j(atomicReference.getAndSet(str), str)) {
            return;
        }
        zxh zxhVar = (zxh) ((ConcurrentHashMap) this.e).remove(str);
        Integer num = null;
        if (zxhVar != null && !zxhVar.v()) {
            fn31.T((llm) this.b, (o8n) null, 0, new l2w(this, wzl1Var, zxhVar, (lnm) null, (byte) 10), 3);
            return;
        }
        v1m1 v1m1VarG = vi11Var.G(str);
        if (v1m1VarG != null && (t1m1Var = v1m1VarG.a) != null) {
            num = t1m1Var.a;
        }
        vi11Var.p(str);
        z(wzl1Var, num);
    }

    public void v() {
        ((vku) this.f).c();
    }

    public synchronized void w(zfg1 zfg1Var) {
        try {
            dm5.y(((AtomicInteger) this.e).getAndDecrement() > 0);
            w4c0 w4c0VarA = ((zfg1) this.f).a();
            if (!Objects.equals(zfg1Var.b, ((zfg1) this.b).b)) {
                w4c0VarA.H(zfg1Var.b);
            }
            if (!Objects.equals(zfg1Var.c, ((zfg1) this.b).c)) {
                w4c0VarA.L(zfg1Var.c);
            }
            int i = zfg1Var.a;
            zfg1 zfg1Var2 = (zfg1) this.b;
            if (i != zfg1Var2.a) {
                w4c0VarA.b = i;
            }
            int i2 = zfg1Var.d;
            if (i2 != zfg1Var2.d) {
                w4c0VarA.c = i2;
            }
            zfg1 zfg1VarC = w4c0VarA.c();
            this.f = zfg1VarC;
            if (((AtomicInteger) this.e).get() == 0 && !((zfg1) this.b).equals((zfg1) this.f)) {
                ((wdd1) this.d).f(new e0i(this, zfg1VarC, (byte) 27));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void x(a8y a8yVar) {
        this.e = a8yVar;
    }

    public Object y(List list, String str, String str2, boolean z, kio kioVar, gj3 gj3Var, a8d1 a8d1Var) {
        if (kioVar instanceof gio) {
            return z ? A(list, gj3Var, a8d1Var) : e(list, gj3Var, a8d1Var);
        }
        if (kioVar instanceof iio) {
            String str3 = ((iio) kioVar).a;
            return z ? B(str3, list, gj3Var, a8d1Var) : f(str3, list, str, str2, gj3Var, a8d1Var);
        }
        if (kioVar instanceof jio) {
            return z ? C(list, a8d1Var) : g(list, a8d1Var);
        }
        if (kioVar instanceof hio) {
            return guo1.H(new csr(((hio) kioVar).a, this, list, str, str2, z, gj3Var, (lnm) null), a8d1Var);
        }
        eg.o();
        return null;
    }

    public void z(wzl1 wzl1Var, Integer num) {
        int i;
        String str;
        b1m1 b1m1VarN = WorkoutSessionEnded.n();
        b1m1VarN.s(wzl1Var.a);
        li20 li20Var = wzl1Var.b;
        int i2 = wzl1Var.c;
        boolean z = num != null && num.intValue() > 0 && i2 >= num.intValue();
        int iOrdinal = li20Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            i = z ? 1 : li20Var.a;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return;
            }
            i = 4;
        }
        if (i == 1) {
            str = "completed";
        } else if (i == 2) {
            str = "user_stopped";
        } else if (i == 3) {
            str = "interrupted";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "error";
        }
        b1m1VarN.q(str);
        b1m1VarN.n(i2);
        if (num != null) {
            b1m1VarN.r(num.intValue());
        }
        WorkoutSessionEnded workoutSessionEndedBuild = b1m1VarN.build();
        t2j0 t2j0Var = (t2j0) this.c;
        workoutSessionEndedBuild.getClass();
        t2j0Var.a(workoutSessionEndedBuild);
    }

    public yjq(c3s c3sVar, kor korVar, th30 th30Var, uww0 uww0Var) {
        this.a = (byte) 11;
        this.c = c3sVar;
        this.d = korVar;
        this.b = th30Var;
        this.e = uww0Var;
        this.f = new rku();
    }

    public yjq(jut jutVar, rmr rmrVar, Scheduler scheduler) {
        this.a = (byte) 22;
        this.c = jutVar;
        this.d = rmrVar;
        this.b = scheduler;
        this.f = new vku();
    }

    public /* synthetic */ yjq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public yjq(t380 t380Var, pv00 pv00Var, nfa0 nfa0Var, dv00 dv00Var) {
        this.a = (byte) 19;
        this.c = t380Var;
        this.d = pv00Var;
        this.b = nfa0Var;
        this.e = dv00Var;
        this.f = new idd1(new v7v(this, (byte) 4));
    }

    public yjq(Context context, ut71 ut71Var, yqg yqgVar, Flowable flowable, bma1 bma1Var) {
        this.a = (byte) 15;
        this.c = context;
        this.d = ut71Var;
        this.b = yqgVar;
        this.e = bma1Var;
        vbm[] vbmVarArr = q601.a;
        this.f = new pzs(new xy0(new kge(flowable), (byte) 17), this, (byte) 8);
    }

    public yjq(opg opgVar, rp5 rp5Var) {
        this.a = (byte) 14;
        u6t u6tVar = u6t.t;
        this.c = opgVar;
        this.d = rp5Var;
        this.b = u6tVar;
        this.f = new Object();
        se11 se11Var = fen.c;
        fen fenVarS = foo1.s();
        if (fenVarS != null) {
            this.e = new ott(fenVarS.a, ((Number) opgVar.invoke()).longValue());
        }
    }

    public yjq(t2j0 t2j0Var, vi11 vi11Var, llm llmVar) {
        this.a = (byte) 27;
        this.c = t2j0Var;
        this.d = vi11Var;
        this.b = llmVar;
        this.e = new ConcurrentHashMap();
        this.f = new AtomicReference(null);
    }

    public yjq(mzr mzrVar, lhp lhpVar, il20 il20Var, k9r k9rVar) {
        this.a = (byte) 9;
        this.c = mzrVar;
        this.d = lhpVar;
        this.b = il20Var;
        this.e = k9rVar;
        this.f = new m441(new vr1(this, (lnm) null));
    }

    public yjq(xrc0 xrc0Var, av1 av1Var, q8n q8nVar, uu00 uu00Var, vo4 vo4Var) {
        this.a = (byte) 12;
        this.c = xrc0Var;
        this.d = q8nVar;
        this.b = uu00Var;
        this.e = vo4Var;
        this.f = new idd1(new ots(av1Var, (byte) 3));
    }

    public yjq(FrameLayout frameLayout, TextView textView, ClearButtonView clearButtonView, ConstraintLayout constraintLayout, EncoreButton encoreButton, ImageView imageView) {
        this.a = (byte) 8;
        this.c = frameLayout;
        this.d = textView;
        this.b = clearButtonView;
        this.e = encoreButton;
        this.f = imageView;
    }

    public yjq(b3k b3kVar, h9d0 h9d0Var, wdd1 wdd1Var, zfg1 zfg1Var) {
        this.a = (byte) 29;
        this.c = h9d0Var;
        this.d = wdd1Var;
        this.b = zfg1Var;
        this.f = zfg1Var;
        this.e = new AtomicInteger();
    }

    public yjq(jbq jbqVar, qop qopVar, obt obtVar) {
        this.a = (byte) 6;
        this.c = qopVar;
        this.d = jbqVar;
        this.e = obtVar;
        this.f = new ttq(this, 1, (byte) 9);
        this.b = iy81.a(new ttq(this, 0, (byte) 9));
    }

    public yjq(ml01 ml01Var, nl01 nl01Var, q7r0 q7r0Var) {
        this.a = (byte) 1;
        this.c = nl01Var;
        this.d = ml01Var;
        this.e = q7r0Var;
        this.f = new jxp(this, 0, (byte) 11);
        this.b = xqu.b(new jxp(this, 1, (byte) 11));
    }

    public yjq(mzr0 mzr0Var, r6h1 r6h1Var) {
        this.a = (byte) 4;
        this.c = mzr0Var;
        this.d = r6h1Var;
        this.b = iy81.a(new ipq(this, 1, (byte) 22));
        this.e = iy81.a(new ipq(this, 2, (byte) 22));
        this.f = iy81.a(new ipq(this, 0, (byte) 22));
    }

    public yjq(a2j1 a2j1Var, b2j1 b2j1Var) {
        this.a = (byte) 5;
        this.c = a2j1Var;
        this.b = xqu.b(new tsq(this, 0, (byte) 17));
        this.e = iy81.a(new tsq(this, 1, (byte) 17));
        this.f = xqu.b(new tsq(this, 2, (byte) 17));
        this.d = xqu.b(new tsq(this, 3, (byte) 17));
    }

    public yjq(nz51 nz51Var, c061 c061Var, q7r0 q7r0Var) {
        this.a = (byte) 2;
        this.c = nz51Var;
        this.d = q7r0Var;
        this.b = xqu.b(new ykq(this, 0, (byte) 29));
        this.e = xqu.b(new ykq(this, 1, (byte) 29));
        this.f = xqu.b(new ykq(this, 2, (byte) 29));
    }

    public yjq(bf71 bf71Var) {
        this.a = (byte) 3;
        this.c = bf71Var;
        this.b = xqu.b(new ipq(this, 0, (byte) 9));
        this.e = xqu.b(new ipq(this, 1, (byte) 9));
        this.f = xqu.b(new ipq(this, 2, (byte) 9));
        this.d = xqu.b(new ipq(this, 3, (byte) 9));
    }

    public yjq(sww0 sww0Var, rww0 rww0Var) {
        this.a = (byte) 0;
        this.c = rww0Var;
        this.d = sww0Var;
        this.b = iy81.a(new ywp(this, 0, (byte) 26));
        this.e = xqu.b(new ywp(this, 1, (byte) 26));
        this.f = iy81.a(new ywp(this, 2, (byte) 26));
    }

    public yjq(n3d n3dVar, n3d n3dVar2, e4d1 e4d1Var) {
        this.a = (byte) 18;
        this.d = n3dVar;
        this.b = n3dVar2;
        this.c = e4d1Var;
    }

    public yjq(vyr vyrVar, sjb sjbVar) {
        this.a = (byte) 10;
        this.c = vyrVar;
        this.f = sjbVar;
        this.d = new HashMap();
        this.b = new HashMap();
    }
}
