package p;

import com.spotify.podcastplaybackspeed.uiusecases.wheelcontrol.WheelControlConfigurationValidator$ValidationException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bnl1 implements l0i {
    public final zml1 a;
    public final anl1 b;

    public bnl1(zml1 zml1Var, anl1 anl1Var) {
        int iIntValue;
        short s = zml1Var.b;
        byte b = zml1Var.a;
        Integer num = anl1Var.c;
        this.a = zml1Var;
        this.b = anl1Var;
        ArrayList arrayList = new ArrayList();
        int i = zml1Var.c;
        if (i <= 0) {
            arrayList.add(new WheelControlConfigurationValidator$ValidationException.StepSmallerThanOne(gvg.e(i, "step(", ") must be bigger than 0")));
        }
        if (num != null && (iIntValue = num.intValue()) <= 0) {
            arrayList.add(new WheelControlConfigurationValidator$ValidationException.MinorLabelStepSmallerThanOne(gvg.e(iIntValue, "minorLabelsStep(", ") must be bigger than 0")));
        }
        if (arrayList.isEmpty()) {
            arrayList = new ArrayList();
            if (b > s) {
                arrayList.add(new WheelControlConfigurationValidator$ValidationException.RangeMinBiggerThanRangeMax(l1d.j(b, s, "rangeMin(", ") must be smaller than rangeMax(", ")")));
            }
            if (50 < i) {
                arrayList.add(new WheelControlConfigurationValidator$ValidationException.LabelStepIsSmallerThanStep(gvg.e(i, "labelStep(", ") must be bigger than step(50)")));
            }
            if (num != null) {
                int iIntValue2 = num.intValue();
                if (iIntValue2 < i) {
                    arrayList.add(new WheelControlConfigurationValidator$ValidationException.MinorLabelStepIsSmallerThanStep(l1d.j(iIntValue2, i, "minorLabelsStep(", ") must be bigger than step(", ")")));
                }
                if (iIntValue2 >= 50) {
                    arrayList.add(new WheelControlConfigurationValidator$ValidationException.MinorLabelStepNotSmallerThanLabelStep(gvg.e(iIntValue2, "minorLabelsStep(", ") must be smaller than labelsStep(50)")));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = new ArrayList();
                if (50 % i != 0) {
                    arrayList.add(new WheelControlConfigurationValidator$ValidationException.LabelStepNotReachableByStep(gvg.e(i, "labelStep(50) must be reachable by step(", ")")));
                }
                if (num != null) {
                    int iIntValue3 = num.intValue();
                    if (iIntValue3 % i != 0) {
                        arrayList.add(new WheelControlConfigurationValidator$ValidationException.MinorLabelStepNotReachableByStep(l1d.j(iIntValue3, i, "minorLabelsStep(", ") must be reachable by step(", ")")));
                    }
                }
                if ((s - b) % i != 0) {
                    arrayList.add(new WheelControlConfigurationValidator$ValidationException.RangeMaxNotReachableByStep(gvg.j(cy30.q(i, s, "step(", ") should be divisor of rangeMax(", ") - rangeMin("), b, ")")));
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("WheelControl Configuration is invalid:\n$".concat(o7h.y0(arrayList2, "\n", (String) null, (String) null, (iu30) null, 62)));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            j2h1.h(illegalStateException, (WheelControlConfigurationValidator$ValidationException) it.next());
        }
        throw illegalStateException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnl1)) {
            return false;
        }
        bnl1 bnl1Var = (bnl1) obj;
        return this.a.equals(bnl1Var.a) && this.b.equals(bnl1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
