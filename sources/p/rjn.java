package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.exceptions.GetCredentialException;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import com.spotify.liveevents.uiusecases.multiavatar.MultiArtistAvatarView;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rjn implements Function, qiw, Producer, ya, hs31 {
    public final /* synthetic */ byte a;
    public Object b;

    public rjn(byte b) {
        this.a = b;
        switch (b) {
            case 23:
                this.b = b380.m();
                break;
            default:
                r6h1 r6h1Var = r6h1.c;
                this.b = new yok0((byte) 15);
                break;
        }
    }

    public boolean a() {
        return ((StateListAnimatorButton) this.b).getContext().getResources().getConfiguration().fontScale >= 1.7f;
    }

    public boolean accept(Object obj) {
        le30 le30Var = ((ksk) obj).c;
        return (le30Var == le30.Y || le30Var == le30.Z) && ((w7r) this.b).g();
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                return rqt0.F(o6x.a, new wt((zd1) this.b, (cnh) obj, (lnm) null, (byte) 25));
            case 14:
                if (y7y0.t("your-library-tags", (Map) obj) && ((d3s) this.b).b.a()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                return new mmr0((zdz0) this.b, (Boolean) obj);
            case 16:
                xds xdsVar = (xds) this.b;
                Throwable th = (Throwable) xdsVar.b.invoke(obj);
                return th == null ? Observable.just(xdsVar.a.invoke(obj)) : Observable.error(th);
            case 20:
                return ((Flowable) this.b).J(new her((tss) obj, (byte) 15)).z();
            case 24:
                spq0 spq0Var = (spq0) obj;
                l6s l6sVar = (l6s) this.b;
                if (spq0Var.c()) {
                    if (((ctc) spq0Var.b()).c >= ((zat) l6sVar.c).a.b() - 86400000) {
                        ctc ctcVar = (ctc) spq0Var.b();
                        sc4 sc4Var = tc4.Companion;
                        Set set = ctcVar.a;
                        Set set2 = ctcVar.b;
                        sc4Var.getClass();
                        return Single.just(new tc4(set, set2));
                    }
                }
                iir iirVar = (iir) l6sVar.a;
                Single singleSubscribeOn = ((cbt) iirVar.b).a().subscribeOn((Scheduler) iirVar.c);
                dbt dbtVar = dbt.b;
                return singleSubscribeOn.map(new v9c((byte) 7)).flatMap(new sun(l6sVar, (byte) 24)).onErrorReturn(new her(l6sVar, spq0Var));
            default:
                v6u v6uVar = (v6u) this.b;
                fn31.T(v6uVar.c, (o8n) null, 0, new n5s(v6uVar, (hqx0) obj, (lnm) null, (byte) 27), 3);
                return Observable.empty();
        }
    }

    public StateListAnimatorButton b() {
        return (StateListAnimatorButton) this.b;
    }

    public void c(Exception exc) {
        GetCredentialException getCredentialException = (GetCredentialException) exc;
        ohd ohdVar = (ohd) this.b;
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(new m231(getCredentialException));
        }
    }

    public void d(iu30 iu30Var) {
        ((StateListAnimatorButton) this.b).setOnClickListener(new yer(iu30Var, (byte) 14));
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:74:0x019c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f7  */
    public void e(lj8 lj8Var) {
        vhr vhrVar;
        vhr vhrVar2;
        Context context;
        Integer num;
        Drawable drawable;
        Integer num2;
        int iIntValue;
        int color;
        r6p1 r6p1Var;
        Drawable drawable2;
        int dimensionPixelSize;
        StateListAnimatorButton stateListAnimatorButton = (StateListAnimatorButton) this.b;
        jj8 jj8Var = lj8Var.a;
        boolean z = lj8Var.b;
        int iOrdinal = jj8Var.ordinal();
        if (iOrdinal == 0) {
            if (z) {
                vhrVar = new vhr(a() ? 2131951675 : 2131954535, new thr(j4b1.o2, stateListAnimatorButton.getResources().getDimension(2131165396)), 2131233130, 2131101480);
            } else {
                vhrVar = new vhr(a() ? 2131951675 : 2131954535, new thr(j4b1.o2, stateListAnimatorButton.getResources().getDimension(2131165396)), 2131233957, 2131101476);
            }
        } else if (iOrdinal == 1) {
            if (z) {
                vhrVar = new vhr(a() ? 2131951671 : 2131962510, new uhr(2131231075), 2131233126, 2131101476);
            } else {
                vhrVar = new vhr(a() ? 2131951671 : 2131962510, new uhr(2131231074), 2131233957, 8);
            }
        } else if (iOrdinal == 2) {
            if (z) {
                vhrVar = new vhr(a() ? 2131951672 : 2131954530, new uhr(2131231076), 2131233134, 2131101472);
            } else {
                vhrVar = new vhr(a() ? 2131951672 : 2131954530, new uhr(2131231076), 2131233957, 8);
            }
        } else if (iOrdinal == 3) {
            vhrVar = new vhr(a() ? 2131951673 : 2131954531, new uhr(2131231077), 2131233957, 8);
        } else {
            if (iOrdinal != 5) {
                if (iOrdinal == 7) {
                    vhrVar = z ? new vhr(2131957704, (r6p1) null, 2131233130, 2) : new vhr(2131957704, (r6p1) null, 2131233957, 10);
                } else if (iOrdinal == 8) {
                    vhrVar2 = new vhr(2131957132, (r6p1) null, 2131233130, 2);
                } else {
                    if (iOrdinal != 9) {
                        eg.m("Button is not supported by ViewBinder");
                        return;
                    }
                    vhrVar2 = new vhr(2131957703, (r6p1) null, 2131233130, 2);
                }
                context = stateListAnimatorButton.getContext();
                num = vhrVar2.c;
                if (num != null) {
                    drawable = context.getDrawable(num.intValue());
                } else {
                    drawable = null;
                }
                stateListAnimatorButton.setBackground(drawable);
                stateListAnimatorButton.setText(context.getText(vhrVar2.a));
                num2 = vhrVar2.d;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 2131100195;
                }
                color = context.getColor(iIntValue);
                stateListAnimatorButton.setTextColor(color);
                r6p1Var = vhrVar2.b;
                if (r6p1Var != null) {
                    drawable2 = null;
                } else if (r6p1Var instanceof uhr) {
                    drawable2 = context.getDrawable(((uhr) r6p1Var).c);
                } else {
                    if (r6p1Var instanceof thr) {
                        eg.o();
                        return;
                    }
                    thr thrVar = (thr) r6p1Var;
                    Drawable g4b1Var = new g4b1(stateListAnimatorButton.getContext(), thrVar.c, thrVar.d);
                    g4b1Var.b(color);
                    drawable2 = g4b1Var;
                }
                dimensionPixelSize = stateListAnimatorButton.getResources().getDimensionPixelSize(2131166732);
                if (drawable2 != null) {
                    stateListAnimatorButton.setPaddingRelative(dimensionPixelSize, stateListAnimatorButton.getPaddingTop(), drawable2.getIntrinsicWidth() + dimensionPixelSize, stateListAnimatorButton.getPaddingBottom());
                }
                stateListAnimatorButton.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, null, null, null);
            }
            if (z) {
                vhrVar = new vhr(a() ? 2131951670 : 2131954529, new thr(j4b1.E2, stateListAnimatorButton.getResources().getDimension(2131165396)), 2131233130, 2131101480);
            } else {
                vhrVar = new vhr(a() ? 2131951670 : 2131954529, new thr(j4b1.E2, stateListAnimatorButton.getResources().getDimension(2131165396)), 2131233957, 8);
            }
        }
        vhrVar2 = vhrVar;
        context = stateListAnimatorButton.getContext();
        num = vhrVar2.c;
        if (num != null) {
            drawable = context.getDrawable(num.intValue());
        } else {
            drawable = null;
        }
        stateListAnimatorButton.setBackground(drawable);
        stateListAnimatorButton.setText(context.getText(vhrVar2.a));
        num2 = vhrVar2.d;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 2131100195;
        }
        color = context.getColor(iIntValue);
        stateListAnimatorButton.setTextColor(color);
        r6p1Var = vhrVar2.b;
        if (r6p1Var != null) {
            drawable2 = null;
        } else if (r6p1Var instanceof uhr) {
            drawable2 = context.getDrawable(((uhr) r6p1Var).c);
        } else {
            if (r6p1Var instanceof thr) {
                eg.o();
                return;
            }
            thr thrVar2 = (thr) r6p1Var;
            Drawable g4b1Var2 = new g4b1(stateListAnimatorButton.getContext(), thrVar2.c, thrVar2.d);
            g4b1Var2.b(color);
            drawable2 = g4b1Var2;
        }
        dimensionPixelSize = stateListAnimatorButton.getResources().getDimensionPixelSize(2131166732);
        if (drawable2 != null) {
            stateListAnimatorButton.setPaddingRelative(dimensionPixelSize, stateListAnimatorButton.getPaddingTop(), drawable2.getIntrinsicWidth() + dimensionPixelSize, stateListAnimatorButton.getPaddingBottom());
        }
        stateListAnimatorButton.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, null, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(tr31 tr31Var, uio uioVar, onm onmVar) {
        vms vmsVar;
        if (onmVar instanceof vms) {
            vmsVar = (vms) onmVar;
            int i = vmsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vmsVar.c = i - Integer.MIN_VALUE;
            } else {
                vmsVar = new vms(this, onmVar);
            }
        } else {
            vmsVar = new vms(this, onmVar);
        }
        Object objD = vmsVar.a;
        int i2 = vmsVar.c;
        if (i2 == 0) {
            hm5.M(objD);
            mxr mxrVar = (mxr) this.b;
            String str = (String) o7h.q0(tr31Var.a.c);
            boolean z = tr31Var.c;
            vmsVar.c = 1;
            objD = mxrVar.D(str, uioVar, z, vmsVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        ims imsVar = (kms) objD;
        if (imsVar instanceof ims) {
            return new ls31(imsVar.a, 1);
        }
        if (imsVar instanceof jms) {
            return null;
        }
        eg.o();
        return null;
    }

    public Object get() {
        return new DispatcherWorker(((qko) this.b).d);
    }

    public void i(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        ((fur) ((wf2) this.b).b).a(intent.getStringExtra("DEVICE_PICKER_INTERACTION_ID"), intent.getBooleanExtra("DEVICE_PICKER_OPEN_PARTICIPANTS", false));
    }

    public void v(Object obj) {
        switch (this.a) {
            case 1:
                avn avnVar = (avn) this.b;
                h72 h72Var = avnVar.U0;
                ((BackButtonView) h72Var.e).n(new fnn(avnVar, (byte) 2));
                ((BehaviorRetainingAppBarLayout) h72Var.d).a(new rzg(avnVar, (byte) 3));
                return;
            case 9:
                Boolean bool = (Boolean) obj;
                EncoreButton encoreButton = ((plr) this.b).a;
                bool.getClass();
                encoreButton.setEnabled(bool.booleanValue());
                return;
            case 10:
                xik xikVar = (xik) obj;
                zmr zmrVar = (zmr) this.b;
                xikVar.getClass();
                Context context = zmrVar.a;
                MultiArtistAvatarView multiArtistAvatarView = zmrVar.h;
                xk6 xk6VarA = zmrVar.a(xikVar);
                s24 s24Var = zmrVar.f;
                ((ConstraintLayout) s24Var.d).setVisibility(xk6VarA != null ? 0 : 8);
                if (xk6VarA == null) {
                    return;
                }
                ((ConstraintLayout) s24Var.d).setContentDescription(xk6VarA.a);
                ((TextView) s24Var.e).setText(xk6VarA.b);
                List listD1 = o7h.d1(xk6VarA.c, 2);
                ViewGroup.LayoutParams layoutParams = multiArtistAvatarView.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                }
                int size = listD1.size();
                layoutParams.width = jch0.U(((size * 24) - (Math.max(size - 1, 0) * 13)) * context.getResources().getDisplayMetrics().density);
                multiArtistAvatarView.setLayoutParams(layoutParams);
                List list = listD1;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kik) it.next()).b);
                }
                multiArtistAvatarView.setAdapter(new an(context, arrayList, zmrVar.Z));
                ConstraintLayout constraintLayout = (ConstraintLayout) s24Var.b;
                if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                    constraintLayout.addOnLayoutChangeListener(new pmr(zmrVar, (byte) 1));
                    return;
                } else {
                    zmrVar.t();
                    return;
                }
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fta ftaVar = ((err) this.b).e;
                int i = zBooleanValue ? 0 : 8;
                ((hva) ftaVar.d).a.setVisibility(i);
                ((FrameLayout) ftaVar.e).setVisibility(i);
                return;
            case 17:
                Boolean bool2 = (Boolean) obj;
                ngr ngrVar = (ngr) this.b;
                bool2.getClass();
                ((AddToButtonView) ((em0) ngrVar.c).c).a(new pk1(bool2.booleanValue() ? qk1.b : qk1.a, false, (String) null, (String) null, tk1.c, 14));
                return;
            case 18:
                g4w0 g4w0Var = (i4w0) obj;
                uhs uhsVar = (uhs) this.b;
                g4w0Var.getClass();
                mzr0 mzr0Var = uhsVar.e;
                tlv tlvVar = uhsVar.g;
                if (g4w0Var instanceof g4w0) {
                    String str = g4w0Var.a;
                    tlvVar.setVisibility(8);
                    VideoSurfaceView videoSurfaceView = (VideoSurfaceView) mzr0Var.g;
                    ArtworkView artworkView = (ArtworkView) mzr0Var.c;
                    videoSurfaceView.setVisibility(8);
                    artworkView.setVisibility(0);
                    artworkView.n(new vas((Object) uhsVar, (byte) 7));
                    artworkView.h(new k07(new g07(str, yz6.d), true));
                    return;
                }
                if (!(g4w0Var instanceof h4w0)) {
                    eg.o();
                    return;
                }
                ArrayList arrayList2 = ((h4w0) g4w0Var).a;
                if (arrayList2.isEmpty()) {
                    return;
                }
                ArtworkView artworkView2 = (ArtworkView) mzr0Var.c;
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) mzr0Var.g;
                artworkView2.setVisibility(8);
                tlvVar.setVisibility(0);
                h360.j(uhsVar.d, uhsVar.i);
                ((ProgressBar) mzr0Var.e).setVisibility(0);
                ivj1 ivj1Var = uhsVar.b;
                String strN = ((k4w0) arrayList2.get(0)).a;
                ths thsVar = uhsVar.Z;
                if (thsVar == null) {
                    u890.C("playbackEventObserver");
                    throw null;
                }
                j4w0 j4w0Var = uhsVar.X;
                if (j4w0Var == null) {
                    u890.C("headerModel");
                    throw null;
                }
                boolean z = j4w0Var.h.a;
                iac0 iac0Var = ivj1Var.c;
                int length = strN.length();
                uoa uoaVar = ivj1Var.d;
                if (length == 0) {
                    if (uoaVar != null) {
                        ivj1Var.a.c(uoaVar);
                        uoaVar.i();
                    }
                    ivj1Var.d = null;
                    iac0Var.getLifecycle().d(ivj1Var);
                } else if (uoaVar != null) {
                    uoaVar.o(z);
                    uoaVar.l();
                } else {
                    if (!Uri.parse(strN).isAbsolute()) {
                        strN = wqn1.n(strN);
                    }
                    o2u0 o2u0Var = new o2u0(strN, 12, (Map) null);
                    videoSurfaceView2.setScaleType(b3k1.c);
                    videoSurfaceView2.setVideoSurfaceCallback(new a1g1(ivj1Var, (byte) 10));
                    uoa uoaVarA = ivj1Var.a(videoSurfaceView2, thsVar, o2u0Var);
                    uoaVarA.o(z);
                    uoaVarA.q(true);
                    uoaVarA.g(o2u0Var);
                    ivj1Var.d = uoaVarA;
                    ivj1Var.f = o2u0Var;
                    ivj1Var.e = thsVar;
                    ivj1Var.g = videoSurfaceView2;
                    ivj1Var.h = Boolean.valueOf(z);
                    iac0Var.getLifecycle().a(ivj1Var);
                }
                Context context2 = uhsVar.a;
                j4w0 j4w0Var2 = uhsVar.X;
                if (j4w0Var2 == null) {
                    u890.C("headerModel");
                    throw null;
                }
                String str2 = j4w0Var2.b;
                ArrayList arrayList3 = j4w0Var2.c.a;
                videoSurfaceView2.setContentDescription(context2.getString(2131960393, str2, arrayList3 != null ? o7h.y0(arrayList3, (CharSequence) null, (String) null, (String) null, c6s.b1, 31) : ""));
                b8k1.p(videoSurfaceView2, new xf(uhsVar, (byte) 4));
                return;
            case 21:
                ((lvs) this.b).f.setText((String) obj);
                return;
            default:
                String str3 = (String) obj;
                s880 s880Var = (s880) ((odr) this.b).c;
                if (str3 == null || str3.length() == 0) {
                    ((TextView) s880Var.e).setVisibility(8);
                    return;
                } else {
                    ((TextView) s880Var.e).setVisibility(0);
                    ((TextView) s880Var.e).setText(str3);
                    return;
                }
        }
    }

    public /* synthetic */ rjn(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public rjn(Context context) {
        this.a = (byte) 8;
        StateListAnimatorButton stateListAnimatorButtonInflate = View.inflate(context, 2131626325, null);
        stateListAnimatorButtonInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.b = stateListAnimatorButtonInflate;
    }
}
