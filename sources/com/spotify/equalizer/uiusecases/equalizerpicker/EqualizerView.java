package com.spotify.equalizer.uiusecases.equalizerpicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.aa80;
import p.b8k1;
import p.bhn0;
import p.ca80;
import p.cfz;
import p.eg7;
import p.hfz;
import p.hhg1;
import p.idd1;
import p.ifz;
import p.iu30;
import p.kb5;
import p.lr80;
import p.m5n1;
import p.o7h;
import p.ocg;
import p.p7h;
import p.pdy;
import p.q7h;
import p.qhl;
import p.rr80;
import p.sr80;
import p.t3x;
import p.tlv;
import p.tr80;
import p.u890;
import p.yy9;
import p.z6x;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002:\u0002\u001a\u001bB1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/spotify/equalizer/uiusecases/equalizerpicker/EqualizerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lp/tlv;", "", "Lp/cfz;", "Lp/dfz;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lp/yy9;", "T0", "Lp/znb0;", "getBackgroundView", "()Lp/yy9;", "backgroundView", "", "U0", "getShortDuration", "()J", "shortDuration", "p/hfz", "p/ifz", "src_main_java_com_spotify_equalizer_uiusecases-uiusecases"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EqualizerView extends ConstraintLayout implements tlv {
    public static final /* synthetic */ int Y0 = 0;
    public final idd1 T0;
    public final idd1 U0;
    public List V0;
    public iu30 W0;
    public List X0;

    public EqualizerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.T0 = new idd1(new t3x((Object) context, (Object) this, (byte) 15));
        this.U0 = new idd1(new pdy(this, (byte) 17));
        this.X0 = z6x.a;
    }

    private final yy9 getBackgroundView() {
        return (yy9) this.T0.getValue();
    }

    private final long getShortDuration() {
        return ((Number) this.U0.getValue()).longValue();
    }

    public final void n(iu30 iu30Var) {
        this.W0 = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031 A[EDGE_INSN: B:13:0x0031->B:21:0x005e BREAK  A[LOOP:0: B:15:0x0037->B:108:?]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean, int] */
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void f(List list) {
        boolean z;
        Object next;
        if (!u890.j(this.V0, list)) {
            List list2 = this.V0;
            ?? r3 = 0;
            if (list2 == null || list2.size() != list.size()) {
                z = true;
                break;
            }
            Collection collectionU1 = o7h.u1(list);
            if (!(collectionU1 instanceof Collection) || !collectionU1.isEmpty()) {
                ca80 it = collectionU1.iterator();
                while (true) {
                    ca80 ca80Var = it;
                    if (!((Iterator) ca80Var.c).hasNext()) {
                        z = true;
                        break;
                    }
                    aa80 aa80Var = (aa80) ca80Var.next();
                    if (((cfz) aa80Var.b).a == ((cfz) list2.get(aa80Var.a)).a) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = true;
                break;
            }
            if (z) {
                if (list.size() <= 1) {
                    hhg1.n("Failed requirement.");
                    return;
                }
                for (hfz hfzVar : this.X0) {
                    ValueAnimator valueAnimator = hfzVar.g;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    hfzVar.g = null;
                    removeView(hfzVar.a);
                }
                tr80 tr80VarK = p7h.K(list);
                int i = ((rr80) tr80VarK).b;
                ArrayList arrayList = new ArrayList(q7h.U(tr80VarK, 10));
                lr80 it2 = tr80VarK.iterator();
                while (((sr80) it2).c) {
                    it2.nextInt();
                    WeakHashMap weakHashMap = b8k1.a;
                    arrayList.add(Integer.valueOf(View.generateViewId()));
                }
                ViewGroup.LayoutParams qhlVar = new qhl(0, 0);
                ((qhl) qhlVar).i = 0;
                ((qhl) qhlVar).l = ((Number) o7h.q0(arrayList)).intValue();
                ((qhl) qhlVar).t = 0;
                ((qhl) qhlVar).v = 0;
                getBackgroundView().setLayoutParams(qhlVar);
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
                ArrayList arrayList2 = new ArrayList();
                if (i >= 0) {
                    int i2 = 0;
                    while (true) {
                        cfz cfzVar = (cfz) list.get(i2);
                        ConstraintLayout constraintLayoutInflate = layoutInflaterFrom.inflate(2131624605, (ViewGroup) this, (boolean) r3);
                        int i3 = 2131429710;
                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131429710);
                        if (textView != null) {
                            i3 = 2131430709;
                            RotatingLayout rotatingLayoutT = m5n1.t(constraintLayoutInflate, 2131430709);
                            if (rotatingLayoutT != null) {
                                i3 = 2131430900;
                                SeekBar seekBar = (SeekBar) m5n1.t(constraintLayoutInflate, 2131430900);
                                if (seekBar != null) {
                                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                                    constraintLayout.setId(((Number) arrayList.get(i2)).intValue());
                                    qhl qhlVar2 = new qhl((int) r3, (int) r3);
                                    qhlVar2.i = r3;
                                    qhlVar2.l = r3;
                                    if (i2 == 0) {
                                        qhlVar2.t = r3;
                                        if (arrayList.size() > 1) {
                                            qhlVar2.u = ((Number) arrayList.get(1)).intValue();
                                        } else {
                                            qhlVar2.v = r3;
                                        }
                                        qhlVar2.J = 1;
                                    } else if (i2 == i) {
                                        qhlVar2.s = ((Number) arrayList.get(i2 - 1)).intValue();
                                        qhlVar2.v = r3;
                                    } else {
                                        qhlVar2.s = ((Number) arrayList.get(i2 - 1)).intValue();
                                        qhlVar2.u = ((Number) arrayList.get(i2 + 1)).intValue();
                                    }
                                    hfz hfzVar2 = new hfz(constraintLayout, cfzVar.a, textView, seekBar, rotatingLayoutT);
                                    arrayList2.add(hfzVar2);
                                    ifz ifzVar = new ifz(this, hfzVar2);
                                    seekBar.setOnSeekBarChangeListener(ifzVar);
                                    seekBar.setOnTouchListener(ifzVar);
                                    addView(constraintLayout, qhlVar2);
                                    if (i2 == i) {
                                        break;
                                    }
                                    i2++;
                                    r3 = 0;
                                }
                            }
                        }
                        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i3)));
                        return;
                    }
                }
                this.X0 = o7h.l1(arrayList2);
            }
            if (this.X0.size() != list.size()) {
                hhg1.n("Failed requirement.");
                return;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                cfz cfzVar2 = (cfz) it3.next();
                Iterator it4 = this.X0.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (((hfz) next).b != cfzVar2.a);
                hfz hfzVar3 = (hfz) next;
                if (hfzVar3 != null) {
                    SeekBar seekBar2 = hfzVar3.d;
                    int i4 = cfzVar2.c;
                    if (i4 < 0) {
                        hhg1.n("Failed requirement.");
                        return;
                    }
                    if (240 < i4) {
                        hhg1.n("Failed requirement.");
                        return;
                    }
                    seekBar2.setMax(240);
                    hfzVar3.c.setText(cfzVar2.b);
                    ValueAnimator valueAnimator2 = hfzVar3.g;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    hfzVar3.g = null;
                    if (!hfzVar3.f && seekBar2.getProgress() != i4) {
                        if (z) {
                            seekBar2.setProgress(i4);
                        } else {
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(seekBar2.getProgress(), i4);
                            valueAnimatorOfInt.setDuration(getShortDuration());
                            valueAnimatorOfInt.addUpdateListener(new ocg(hfzVar3, this, (byte) 4));
                            arrayList3.add(valueAnimatorOfInt);
                            hfzVar3.g = valueAnimatorOfInt;
                        }
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                addOnLayoutChangeListener(new eg7(this, (byte) 13));
            } else {
                ((ValueAnimator) o7h.q0(arrayList3)).addUpdateListener(new kb5(this, (byte) 9));
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    ((ValueAnimator) it5.next()).start();
                }
            }
        }
        this.V0 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(boolean z) {
        yy9 backgroundView = getBackgroundView();
        List list = this.X0;
        Rect rect = new Rect();
        List<hfz> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (hfz hfzVar : list2) {
            SeekBar seekBar = hfzVar.d;
            RotatingLayout rotatingLayout = hfzVar.e;
            seekBar.getThumb().copyBounds(rect);
            rect.set(rect.top, rotatingLayout.getBottom() - rect.right, rect.bottom, rotatingLayout.getBottom() - rect.left);
            offsetDescendantRectToMyCoords(rotatingLayout, rect);
            offsetRectIntoDescendantCoords(getBackgroundView(), rect);
            PointF pointF = new PointF(rect.exactCenterX(), rect.exactCenterY());
            pointF.offset(0.0f, (-hfzVar.d.getThumbOffset()) / 2.0f);
            arrayList.add(pointF);
        }
        backgroundView.a(arrayList, z);
    }

    public EqualizerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public EqualizerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public EqualizerView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ EqualizerView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
