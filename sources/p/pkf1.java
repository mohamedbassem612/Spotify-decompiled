package p;

import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.spotify.legacyglue.carousel.CarouselLayoutManager;
import com.spotify.legacyglue.carousel.CarouselView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pkf1 extends CarouselView {
    public static final /* synthetic */ int t2 = 0;
    public CarouselLayoutManager p2;
    public uwd q2;
    public iu30 r2;
    public boolean s2;

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0(ikf1 ikf1Var, boolean z) {
        vm1 vm1Var = new vm1(z, (Object) this, (Object) ikf1Var, (byte) 24);
        if (!u890.j(Looper.myLooper(), Looper.getMainLooper()) || Y()) {
            post(new xfz0(vm1Var, (byte) 28));
        } else {
            vm1Var.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent.getActionMasked() == 0) {
            WeakHashMap weakHashMap = b8k1.a;
            hsl1 hsl1VarA = s7k1.a(this);
            boolean z = false;
            if (hsl1VarA != null) {
                esl1 esl1Var = hsl1VarA.a;
                nk80 nk80VarJ = esl1Var.j(2);
                nk80 nk80VarJ2 = esl1Var.j(1);
                int[] iArr = new int[2];
                getRootView().getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                int width = getRootView().getWidth() + i;
                int height = getRootView().getHeight() + i2;
                if (motionEvent.getRawY() < i2 + nk80VarJ2.b || (!esl1Var.u(2) && (motionEvent.getRawX() < i + nk80VarJ.a || motionEvent.getRawX() >= width - nk80VarJ.c || motionEvent.getRawY() >= height - nk80VarJ.d))) {
                    z = true;
                }
            }
            this.s2 = z;
            if (!z || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // com.spotify.legacyglue.carousel.CarouselView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        E0(motionEvent);
        return !this.s2 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.spotify.legacyglue.carousel.CarouselView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        E0(motionEvent);
        return this.s2 || super.onTouchEvent(motionEvent);
    }

    public final void setAdapter$src_main_java_com_spotify_nowplaying_uiusecases_uiusecases(r3g1 r3g1Var) {
        super.setAdapter(r3g1Var);
        CarouselLayoutManager carouselLayoutManager = new CarouselLayoutManager(2);
        this.p2 = carouselLayoutManager;
        setLayoutManager(carouselLayoutManager);
        setNestedScrollingEnabled(false);
        ywd ywdVar = new ywd();
        ((zw81) ywdVar).g = !r3g1Var.h;
        setItemAnimator(ywdVar);
        nl51 nl51Var = new nl51(this, (byte) 28);
        uwd uwdVar = new uwd();
        uwdVar.g = this;
        uwdVar.h = nl51Var;
        uwdVar.e = -1;
        uwdVar.d = true;
        if (!(getAdapter() instanceof r3g1)) {
            hhg1.n("Carousel must have a TracksCarouselAdapter.");
            throw null;
        }
        setOnLayoutChildrenListener(new uq8(uwdVar, (byte) 10));
        uwdVar.i = getAdapter();
        this.l2.add(new twd(uwdVar));
        this.q2 = uwdVar;
    }

    public final void setAllowChildVideoPlayback$src_main_java_com_spotify_nowplaying_uiusecases_uiusecases(boolean z) {
        uwd uwdVar = this.q2;
        if (uwdVar != null) {
            uwdVar.d = z;
        } else {
            u890.C("carouselController");
            throw null;
        }
    }

    public final void setIsMediaModeVideo$src_main_java_com_spotify_nowplaying_uiusecases_uiusecases(boolean z) {
        uwd uwdVar = this.q2;
        if (uwdVar != null) {
            uwdVar.f = z;
        } else {
            u890.C("carouselController");
            throw null;
        }
    }

    public final void setOnSwipeListener$src_main_java_com_spotify_nowplaying_uiusecases_uiusecases(iu30 iu30Var) {
        this.r2 = iu30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setRestrictions$src_main_java_com_spotify_nowplaying_uiusecases_uiusecases(hkf1 hkf1Var) {
        uwd uwdVar = this.q2;
        if (uwdVar == null) {
            u890.C("carouselController");
            throw null;
        }
        uwdVar.c = hkf1Var.d;
        uwdVar.b = hkf1Var.e;
        post(new jyh0(this, hkf1Var, (byte) 26));
        post(new aih0(this, hkf1Var, false, (byte) 29));
    }
}
