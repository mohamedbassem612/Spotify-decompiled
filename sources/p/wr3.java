package p;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wr3 implements Runnable {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;
    public final /* synthetic */ Object d;

    public wr3(int i, r3g1 r3g1Var, Function0 function0) {
        this.a = (byte) 11;
        this.b = i;
        this.c = r3g1Var;
        this.d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        mzc mzcVar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        t8r0 t8r0Var = null;
        switch (this.a) {
            case 0:
                Rect rect = new Rect();
                View view = (View) this.c;
                view.getHitRect(rect);
                int i = rect.top;
                int i2 = this.b;
                rect.top = i - i2;
                rect.left -= i2;
                rect.bottom += i2;
                rect.right += i2;
                ((xr3) this.d).setTouchDelegate(new TouchDelegate(rect, view));
                return;
            case 1:
                bl5.d((TextView) this.c, (Typeface) this.d, this.b);
                return;
            case 2:
                ((BottomSheetBehavior) this.d).N((View) this.c, this.b);
                return;
            case 3:
                Rect rect2 = new Rect();
                View view2 = (View) this.c;
                view2.getHitRect(rect2);
                int i3 = rect2.bottom;
                int i4 = rect2.top;
                int i5 = this.b;
                int i6 = i5 - (i3 - i4);
                if (i6 > 0) {
                    int i7 = i6 / 2;
                    rect2.top = i4 - i7;
                    rect2.bottom = i3 + i7;
                }
                int i8 = rect2.right;
                int i9 = rect2.left;
                int i10 = i5 - (i8 - i9);
                if (i10 > 0) {
                    int i11 = i10 / 2;
                    rect2.left = i9 - i11;
                    rect2.right = i8 + i11;
                }
                ((View) this.d).setTouchDelegate(new TouchDelegate(rect2, view2));
                return;
            case 4:
                dtw dtwVar = (dtw) this.d;
                View view3 = (View) this.c;
                if (view3.getParent() == null) {
                    if (view3.isAttachedToWindow()) {
                        int i12 = this.b;
                        if (i12 < 3) {
                            this.b = i12 + 1;
                            view3.postOnAnimation(this);
                            return;
                        } else {
                            view3.requestLayout();
                            view3.addOnLayoutChangeListener(new x37(view3, dtwVar, (byte) 11));
                            return;
                        }
                    }
                    return;
                }
                sqw sqwVar = dtwVar.l;
                sqwVar.h = null;
                sqwVar.i = false;
                t8r0 t8r0Var2 = dtwVar.x;
                if (t8r0Var2 != null) {
                    t8r0Var = ((rl1) t8r0Var2.b).b ? null : t8r0Var2;
                    if (t8r0Var != null) {
                        dtwVar.l(t8r0Var);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                Rect rect3 = new Rect();
                EntityActionView entityActionView = (EntityActionView) this.c;
                entityActionView.getHitRect(rect3);
                int i13 = rect3.top;
                int i14 = this.b;
                rect3.top = i13 - i14;
                rect3.left -= i14;
                rect3.bottom += i14;
                rect3.right += i14;
                ((ViewGroup) this.d).setTouchDelegate(new TouchDelegate(rect3, entityActionView));
                return;
            case 6:
                cn90 cn90Var = (cn90) this.c;
                w611 w611Var = cn90Var.e;
                fn90 fn90Var = (fn90) this.d;
                RecyclerView recyclerView = fn90Var.Q0;
                if (recyclerView == null || !recyclerView.V0 || cn90Var.k || w611Var.m() == -1) {
                    return;
                }
                e611 itemAnimator = fn90Var.Q0.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.i()) {
                    ArrayList arrayList7 = fn90Var.O0;
                    int size = arrayList7.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        if (((cn90) arrayList7.get(i15)).l) {
                        }
                    }
                    fn90Var.Y.l(this.b, w611Var);
                    return;
                }
                fn90Var.Q0.post(this);
                return;
            case 7:
                suc0 suc0Var = (suc0) this.d;
                int i16 = this.b;
                n8d0 n8d0Var = (n8d0) this.c;
                boolean z = suc0Var.c;
                AtomicInteger atomicInteger = suc0Var.d;
                ArrayList arrayList8 = suc0Var.b;
                if (!suc0Var.isDone()) {
                    try {
                        if (arrayList8 != null) {
                            o0c.q("Tried to set value from future which is not done", n8d0Var.isDone());
                            arrayList8.set(i16, poz0.z(n8d0Var));
                            int iDecrementAndGet = atomicInteger.decrementAndGet();
                            o0c.q("Less than 0 remaining futures", iDecrementAndGet >= 0);
                            if (iDecrementAndGet == 0) {
                                if (arrayList6 != null) {
                                    mzcVar = suc0Var.f;
                                    arrayList2 = new ArrayList(arrayList6);
                                    mzcVar.b(arrayList2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } catch (RuntimeException e) {
                        if (z) {
                            suc0Var.f.c(e);
                        }
                        int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                        o0c.q("Less than 0 remaining futures", iDecrementAndGet2 >= 0);
                        if (iDecrementAndGet2 == 0) {
                            if (arrayList5 != null) {
                                mzcVar = suc0Var.f;
                                arrayList2 = new ArrayList(arrayList5);
                            }
                            return;
                        }
                        return;
                    } catch (ExecutionException e2) {
                        if (z) {
                            suc0Var.f.c(e2.getCause());
                        }
                        int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                        o0c.q("Less than 0 remaining futures", iDecrementAndGet3 >= 0);
                        if (iDecrementAndGet3 == 0) {
                            if (arrayList4 != null) {
                                mzcVar = suc0Var.f;
                                arrayList2 = new ArrayList(arrayList4);
                            }
                            return;
                        }
                        return;
                    } catch (Error e3) {
                        suc0Var.f.c(e3);
                        int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                        o0c.q("Less than 0 remaining futures", iDecrementAndGet4 >= 0);
                        if (iDecrementAndGet4 == 0) {
                            if (arrayList3 != null) {
                                mzcVar = suc0Var.f;
                                arrayList2 = new ArrayList(arrayList3);
                            }
                            return;
                        }
                        return;
                    } catch (CancellationException unused) {
                        if (z) {
                            suc0Var.cancel(false);
                        }
                        int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                        o0c.q("Less than 0 remaining futures", iDecrementAndGet5 >= 0);
                        if (iDecrementAndGet5 == 0) {
                            if (arrayList != null) {
                                mzcVar = suc0Var.f;
                                arrayList2 = new ArrayList(arrayList);
                            }
                            return;
                        }
                        return;
                    } finally {
                        int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                        o0c.q("Less than 0 remaining futures", iDecrementAndGet6 >= 0);
                        if (iDecrementAndGet6 == 0) {
                            ArrayList arrayList9 = suc0Var.b;
                            if (arrayList9 != null) {
                                suc0Var.f.b(new ArrayList(arrayList9));
                            } else {
                                o0c.q((String) null, suc0Var.isDone());
                            }
                        }
                    }
                }
                o0c.q("Future was done before all dependencies completed", z);
                return;
            case 8:
                zhq0 zhq0Var = (zhq0) this.c;
                Activity activity = (Activity) zhq0Var.b;
                CharSequence text = activity.getText(2131964121);
                Resources resources = activity.getResources();
                int i17 = this.b;
                mw40 mw40VarT = yoi1.T(activity, text, resources.getQuantityString(2131820957, i17, Integer.valueOf(i17)));
                CharSequence text2 = activity.getText(2131964120);
                lik1 lik1Var = (lik1) this.d;
                ezs0 ezs0Var = new ezs0(zhq0Var, i17, lik1Var);
                mw40VarT.a = text2;
                mw40VarT.c = ezs0Var;
                mw40VarT.h = new fzs0(zhq0Var, i17, lik1Var);
                mw40VarT.e = true;
                mw40VarT.b().b();
                return;
            case 9:
                ((ResultReceiver) this.d).onReceiveResult(this.b, (Bundle) this.c);
                return;
            case 10:
                il91 il91Var = (il91) this.c;
                jj91 jj91Var = il91Var.d;
                int i18 = this.b;
                if (jj91Var.a(i18) != null) {
                    il91Var.t.onNext(new kk91(i18, (d7e) this.d));
                    return;
                }
                return;
            case 11:
                if (this.b == ((r3g1) this.c).t) {
                    ((Function0) this.d).invoke();
                    return;
                }
                return;
            default:
                fsn1 fsn1Var = (fsn1) this.c;
                dwh0 dwh0Var = (dwh0) this.d;
                int i19 = this.b;
                synchronized (fsn1Var.n) {
                    fsn1Var.c1(dwh0Var, i19);
                    break;
                }
                return;
        }
    }

    public /* synthetic */ wr3(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ wr3(Object obj, int i, Object obj2, byte b, boolean z) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = obj2;
    }

    public /* synthetic */ wr3(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public /* synthetic */ wr3(Object obj, Object obj2, int i, byte b, boolean z) {
        this.a = b;
        this.d = obj;
        this.c = obj2;
        this.b = i;
    }

    public wr3(View view, dtw dtwVar) {
        this.a = (byte) 4;
        this.c = view;
        this.d = dtwVar;
    }
}
