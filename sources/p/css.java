package p;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class css extends k9 {
    public final boolean c;
    public boolean d;
    public t7y e;

    public css(foa1 foa1Var, boolean z) {
        super(foa1Var, (byte) 5);
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9 A[Catch: RuntimeException -> 0x00ef, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x00ef, blocks: (B:78:0x00e3, B:80:0x00e9), top: B:91:0x00e3 }] */
    public final t7y v1(Context context) {
        int i;
        t7y t7yVar;
        Animator animatorLoadAnimator;
        int iE;
        if (this.d) {
            return this.e;
        }
        zf30 zf30Var = U0().c;
        boolean z = U0().a == 2;
        vf30 vf30Var = zf30Var.m1;
        int i2 = vf30Var == null ? 0 : vf30Var.f;
        if (this.c) {
            if (z) {
                if (vf30Var == null) {
                    i = 0;
                } else {
                    i = vf30Var.d;
                }
            } else if (vf30Var == null) {
                i = 0;
            } else {
                i = vf30Var.e;
            }
        } else if (z) {
            if (vf30Var == null) {
                i = 0;
            } else {
                i = vf30Var.b;
            }
        } else if (vf30Var == null) {
            i = 0;
        } else {
            i = vf30Var.c;
        }
        zf30Var.S0(0, 0, 0, 0);
        ViewGroup viewGroup = zf30Var.i1;
        t7y t7yVar2 = null;
        if (viewGroup != null && viewGroup.getTag(2131431647) != null) {
            zf30Var.i1.setTag(2131431647, null);
        }
        ViewGroup viewGroup2 = zf30Var.i1;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (i == 0 && i2 != 0) {
                if (i2 == 4097) {
                    iE = z ? 2130837515 : 2130837516;
                } else if (i2 == 8194) {
                    iE = z ? 2130837511 : 2130837512;
                } else if (i2 == 8197) {
                    iE = z ? ila0.E(context, R.attr.activityCloseEnterAnimation) : ila0.E(context, R.attr.activityCloseExitAnimation);
                } else if (i2 == 4099) {
                    iE = z ? 2130837513 : 2130837514;
                } else if (i2 != 4100) {
                    iE = -1;
                } else {
                    iE = z ? ila0.E(context, R.attr.activityOpenEnterAnimation) : ila0.E(context, R.attr.activityOpenExitAnimation);
                }
                i = iE;
            }
            if (i != 0) {
                boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(i));
                if (zEquals) {
                    try {
                        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, i);
                        if (animationLoadAnimation != null) {
                            t7yVar = new t7y(animationLoadAnimation);
                            t7yVar2 = t7yVar;
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                        try {
                            animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                            if (animatorLoadAnimator != null) {
                                t7yVar = new t7y(animatorLoadAnimator);
                                t7yVar2 = t7yVar;
                            }
                        } catch (RuntimeException e2) {
                            if (zEquals) {
                                throw e2;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, i);
                            if (animationLoadAnimation2 != null) {
                                t7yVar2 = new t7y(animationLoadAnimation2);
                            }
                        }
                    }
                } else {
                    animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
                    if (animatorLoadAnimator != null) {
                        t7yVar = new t7y(animatorLoadAnimator);
                        t7yVar2 = t7yVar;
                    }
                }
            }
        }
        this.e = t7yVar2;
        this.d = true;
        return t7yVar2;
    }
}
