package p;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mainlayout.ui.view.MainLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b1g0 extends sgp0 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ d1g0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public b1g0(d1g0 d1g0Var) {
        this.b = (byte) 3;
        Boolean bool = Boolean.FALSE;
        this.c = d1g0Var;
        super(bool);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0190  */
    /* JADX WARN: Code duplicated, block: B:109:0x0198  */
    /* JADX WARN: Code duplicated, block: B:110:0x019c  */
    /* JADX WARN: Code duplicated, block: B:112:0x019f  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:126:0x020c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0221  */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView] */
    /* JADX WARN: Type inference failed for: r6v40, types: [android.view.View, com.spotify.mainlayout.ui.view.MainLayout] */
    public final void a(mma0 mma0Var, Object obj, Object obj2) {
        View fragmentContainer;
        int i;
        int i2;
        c6w0 c6w0VarB;
        c6w0 c6w0Var;
        int i3;
        int i4;
        int i5;
        ?? bannerContainer;
        qhl layoutParams;
        qhl layoutParams2;
        byte b = this.b;
        d1g0 d1g0Var = this.c;
        switch (b) {
            case 0:
                float f = 0.0f;
                MainLayout mainLayout = d1g0Var.a;
                a1g0 a1g0Var = (a1g0) obj2;
                a1g0 a1g0Var2 = (a1g0) obj;
                if (!u890.j(a1g0Var2, a1g0Var)) {
                    q3c q3cVar = d1g0.h;
                    e6w0 e6w0VarB = d1g0Var.b();
                    if (e6w0VarB == null) {
                        e6w0VarB = null;
                    } else if (e6w0VarB instanceof z5w0) {
                        e6w0VarB = ((z5w0) e6w0VarB).a;
                    }
                    if (!(e6w0VarB instanceof b6w0)) {
                        if (mainLayout.getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view().b) {
                            fragmentContainer = mainLayout.getFragmentOverlayContainer();
                        } else {
                            q3cVar.getClass();
                            fragmentContainer = u890.j(mainLayout.getFragmentContainer().getParent(), mainLayout) ? mainLayout.getFragmentContainer() : (View) mainLayout.getFragmentContainer().getParent();
                        }
                        View navigationWindowInsetsSpace = mainLayout.getOverlayMode$src_main_java_com_spotify_mainlayout_ui_view_view().b ? mainLayout.getNavigationWindowInsetsSpace() : mainLayout.getFragmentContainerBottomOverlapTouchEventConsumer();
                        kil kilVar = new kil();
                        kilVar.f(mainLayout);
                        View snackbarContainer = mainLayout.getSnackbarContainer();
                        q3cVar.getClass();
                        kilVar.g(snackbarContainer.getId(), 6, fragmentContainer.getId(), 6);
                        kilVar.g(snackbarContainer.getId(), 7, fragmentContainer.getId(), 7);
                        kilVar.b(mainLayout);
                        mainLayout.getSnackbarBarrierBottom().setReferencedIds(new int[]{mainLayout.getImeWindowInsetsSpace().getId(), navigationWindowInsetsSpace.getId()});
                    }
                    d1g0.c(mainLayout.getFragmentContainer(), d1g0Var.a().a);
                    ViewGroup nowPlayingMiniContainer = mainLayout.getNowPlayingMiniContainer();
                    if (nowPlayingMiniContainer != null) {
                        d1g0.c(nowPlayingMiniContainer, d1g0Var.a().a);
                    }
                    o6 nowPlayingViewContainer = mainLayout.getNowPlayingViewContainer();
                    if (nowPlayingViewContainer != null) {
                        d1g0.c(nowPlayingViewContainer, d1g0Var.a().a);
                    }
                    o6 nowPlayingViewAttachmentsContainer = mainLayout.getNowPlayingViewAttachmentsContainer();
                    if (nowPlayingViewAttachmentsContainer != null) {
                        d1g0.c(nowPlayingViewAttachmentsContainer, d1g0Var.a().a);
                    }
                    d1g0.c(mainLayout.getNavigationContainer(), d1g0Var.a().b);
                    d1g0.c(mainLayout.getLimitedExperienceIndicatorContainer(), d1g0Var.a().c);
                    float z = (!d1g0Var.a().a || d1g0Var.a().b) ? 0.0f : mainLayout.getFragmentOverlayContainer().getZ() + 1.0f;
                    if (d1g0Var.a().a && !d1g0Var.a().c) {
                        f = z;
                    }
                    cvq0 cvq0Var = (cvq0) d1g0Var.b.getValue();
                    cvq0Var.b.post(new aih0(cvq0Var, new c1g0(d1g0Var, z, f, (byte) 0), false, (byte) 8));
                    if (!a1g0Var2.a && a1g0Var.a) {
                        mainLayout.getFragmentContainer().clearFocus();
                    }
                    d1g0Var.d();
                    View displayCutoutPlaceholderStart = mainLayout.getDisplayCutoutPlaceholderStart();
                    if (displayCutoutPlaceholderStart != null) {
                        displayCutoutPlaceholderStart.setVisibility(!a1g0Var.a ? 4 : 0);
                    }
                }
                break;
            case 1:
                idd1 idd1Var = d1g0Var.b;
                ?? r6 = d1g0Var.a;
                if (!u890.j((e6w0) obj, (e6w0) obj2)) {
                    d1g0Var.e();
                    c6w0 c6w0VarB2 = d1g0Var.b();
                    c6w0 c6w0Var2 = c6w0VarB2 instanceof c6w0 ? c6w0VarB2 : null;
                    int i6 = c6w0Var2 != null ? c6w0Var2.b : 0;
                    if (d1g0Var.g) {
                        cvq0 cvq0Var2 = (cvq0) idd1Var.getValue();
                        View view = cvq0Var2.b;
                        int i7 = cvq0Var2.e;
                        if (i7 != i6) {
                            boolean z2 = i7 != 0;
                            boolean z3 = i6 != 0;
                            boolean z4 = z2 != z3 || (z2 && z3 && (view.getAlpha() > 1.0f ? 1 : (view.getAlpha() == 1.0f ? 0 : -1)) < 0);
                            boolean z5 = z2 && z3;
                            boolean z6 = z2 && !z3;
                            int iB = cvq0Var2.b(i6);
                            cvq0Var2.a();
                            i = 0;
                            if (z4) {
                                i2 = 1;
                                boolean z7 = !z5;
                                if (!z5 && iB != 0) {
                                    view.setBackgroundColor(iB);
                                }
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), z6 ? 0.0f : 1.0f);
                                objectAnimatorOfFloat.addListener(new bvq0(z7, iB, cvq0Var2));
                                cvq0Var2.g = objectAnimatorOfFloat;
                                objectAnimatorOfFloat.setDuration(300L);
                            } else {
                                i2 = 1;
                            }
                            if (z4 || z5) {
                                int i8 = (iB >> 24) & 255;
                                View view2 = cvq0Var2.a;
                                if (i8 < 255) {
                                    view2.setAlpha(1.0f);
                                } else {
                                    float alpha = view2.getAlpha();
                                    float f2 = z3 ? 0.0f : 1.0f;
                                    float[] fArr = new float[2];
                                    fArr[0] = alpha;
                                    fArr[i2] = f2;
                                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "alpha", fArr);
                                    cvq0Var2.h = objectAnimatorOfFloat2;
                                    if (objectAnimatorOfFloat2 != null) {
                                        objectAnimatorOfFloat2.setDuration(300L);
                                    }
                                }
                            }
                            if (z5) {
                                Drawable background = view.getBackground();
                                ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0, iB);
                                cvq0Var2.f = valueAnimatorOfArgb;
                                if (valueAnimatorOfArgb != null) {
                                    valueAnimatorOfArgb.addUpdateListener(new kb5(cvq0Var2, (byte) 15));
                                }
                                ValueAnimator valueAnimator = cvq0Var2.f;
                                if (valueAnimator != null) {
                                    valueAnimator.setDuration(300L);
                                }
                            }
                            ValueAnimator valueAnimator2 = cvq0Var2.f;
                            if (valueAnimator2 != null) {
                                valueAnimator2.start();
                            }
                            ObjectAnimator objectAnimator = cvq0Var2.g;
                            if (objectAnimator != null) {
                                objectAnimator.start();
                            }
                            ObjectAnimator objectAnimator2 = cvq0Var2.h;
                            if (objectAnimator2 != null) {
                                objectAnimator2.start();
                            }
                            cvq0Var2.e = i6;
                        }
                        if (r6.getMode() != qyf0.b) {
                            c6w0VarB = d1g0Var.b();
                            if (c6w0VarB instanceof c6w0) {
                                c6w0Var = c6w0VarB;
                            } else {
                                c6w0Var = null;
                            }
                            if (c6w0Var != null) {
                                i3 = c6w0Var.b;
                            } else {
                                i3 = i;
                            }
                            i4 = i2;
                            if (i3 == i4) {
                                i5 = i4;
                            } else {
                                i5 = i;
                            }
                            bannerContainer = r6.getBannerContainer();
                            if (i5 != 0) {
                                bannerContainer.m81setContentMarginBottom0680j_4(r6.getResources().getDimension(2131166393) / r6.getResources().getDisplayMetrics().density);
                                bannerContainer.m83setCornerRadius0680j_4(r6.getResources().getDimension(2131166390) / r6.getResources().getDisplayMetrics().density);
                                layoutParams = bannerContainer.getLayoutParams();
                                if (layoutParams != null) {
                                    bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                } else {
                                    qhl qhlVar = layoutParams;
                                    int dimension = (int) r6.getResources().getDimension(2131166393);
                                    qhlVar.setMarginStart(dimension);
                                    qhlVar.setMarginEnd(dimension);
                                    bannerContainer.setLayoutParams(qhlVar);
                                }
                            } else {
                                bannerContainer.m81setContentMarginBottom0680j_4(0.0f);
                                bannerContainer.m83setCornerRadius0680j_4(0.0f);
                                layoutParams2 = bannerContainer.getLayoutParams();
                                if (layoutParams2 != null) {
                                    bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                } else {
                                    qhl qhlVar2 = layoutParams2;
                                    int i9 = i;
                                    qhlVar2.setMarginStart(i9);
                                    qhlVar2.setMarginEnd(i9);
                                    bannerContainer.setLayoutParams(qhlVar2);
                                }
                            }
                            break;
                        }
                    } else {
                        d1g0Var.g = true;
                        cvq0 cvq0Var3 = (cvq0) idd1Var.getValue();
                        View view3 = cvq0Var3.a;
                        View view4 = cvq0Var3.b;
                        cvq0Var3.a();
                        cvq0Var3.e = i6;
                        if (i6 != 0) {
                            int iB2 = cvq0Var3.b(i6);
                            view4.setAlpha(1.0f);
                            view4.setBackgroundColor(iB2);
                            view3.setAlpha(((iB2 >> 24) & 255) >= 255 ? 0.0f : 1.0f);
                        } else {
                            view4.setAlpha(0.0f);
                            view3.setAlpha(1.0f);
                        }
                    }
                    i2 = 1;
                    i = 0;
                    if (r6.getMode() != qyf0.b) {
                        c6w0VarB = d1g0Var.b();
                        if (c6w0VarB instanceof c6w0) {
                            c6w0Var = c6w0VarB;
                        } else {
                            c6w0Var = null;
                        }
                        if (c6w0Var != null) {
                            i3 = c6w0Var.b;
                        } else {
                            i3 = i;
                        }
                        i4 = i2;
                        if (i3 == i4) {
                            i5 = i4;
                        } else {
                            i5 = i;
                        }
                        bannerContainer = r6.getBannerContainer();
                        if (i5 != 0) {
                            bannerContainer.m81setContentMarginBottom0680j_4(r6.getResources().getDimension(2131166393) / r6.getResources().getDisplayMetrics().density);
                            bannerContainer.m83setCornerRadius0680j_4(r6.getResources().getDimension(2131166390) / r6.getResources().getDisplayMetrics().density);
                            layoutParams = bannerContainer.getLayoutParams();
                            if (layoutParams != null) {
                                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            } else {
                                qhl qhlVar3 = layoutParams;
                                int dimension2 = (int) r6.getResources().getDimension(2131166393);
                                qhlVar3.setMarginStart(dimension2);
                                qhlVar3.setMarginEnd(dimension2);
                                bannerContainer.setLayoutParams(qhlVar3);
                            }
                        } else {
                            bannerContainer.m81setContentMarginBottom0680j_4(0.0f);
                            bannerContainer.m83setCornerRadius0680j_4(0.0f);
                            layoutParams2 = bannerContainer.getLayoutParams();
                            if (layoutParams2 != null) {
                                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            } else {
                                qhl qhlVar4 = layoutParams2;
                                int i10 = i;
                                qhlVar4.setMarginStart(i10);
                                qhlVar4.setMarginEnd(i10);
                                bannerContainer.setLayoutParams(qhlVar4);
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (!u890.j((hgr0) obj, (hgr0) obj2)) {
                    d1g0Var.e();
                }
                break;
            default:
                if (((Boolean) obj).booleanValue() != ((Boolean) obj2).booleanValue()) {
                    d1g0Var.d();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1g0(a1g0 a1g0Var, d1g0 d1g0Var) {
        super(a1g0Var);
        this.b = (byte) 0;
        this.c = d1g0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1g0(d1g0 d1g0Var, byte b) {
        super((Object) null);
        this.b = b;
        this.c = d1g0Var;
    }
}
