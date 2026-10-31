package p;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class alo0 extends glo0 {
    public final ArrayList e = new ArrayList();
    public int f = 0;

    @Override // p.glo0
    public final void a(Bundle bundle) {
        super.a(bundle);
        if (Build.VERSION.SDK_INT >= 37) {
            return;
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (yko0 yko0Var : this.e) {
            Bundle bundle2 = new Bundle();
            wko0 wko0Var = yko0Var.a;
            Bundle bundle3 = new Bundle();
            if (wko0Var instanceof xko0) {
                bundle3.putInt("_type", 1);
            } else if (wko0Var instanceof rko0) {
                bundle3.putInt("_type", 2);
            } else if (wko0Var instanceof vko0) {
                bundle3.putInt("_type", 3);
            } else if (wko0Var instanceof tko0) {
                bundle3.putInt("_type", 4);
            } else if (wko0Var instanceof sko0) {
                bundle3.putInt("_type", 5);
            } else {
                if (!(wko0Var instanceof uko0)) {
                    ncn0.e(wko0Var, "Impossible MetricValue subclass: ");
                    return;
                }
                bundle3.putInt("_type", 6);
            }
            wko0Var.a(bundle3);
            bundle2.putBundle("value", bundle3);
            bundle2.putString("label", yko0Var.b);
            bundle2.putInt("semanticStyle", yko0Var.c);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("android.metrics", arrayList);
        bundle.putInt("android.metrics.criticalIndex", this.f);
    }

    @Override // p.glo0
    public final void b(fdc fdcVar) {
        if (this.e.isEmpty()) {
            hhg1.n("A MetricStyle must have at least one Metric");
        } else if (Build.VERSION.SDK_INT >= 37) {
            ((Notification.Builder) fdcVar.d).setStyle(zko0.d(this));
        }
    }

    @Override // p.glo0
    public final String d() {
        return "androidx.core.app.NotificationCompat$MetricStyle";
    }

    @Override // p.glo0
    public final void e(Bundle bundle) {
        wko0 xko0Var;
        super.e(bundle);
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList<Bundle> arrayListU = jhc1.u(bundle, "android.metrics", Bundle.class);
        if (arrayListU != null) {
            for (Bundle bundle2 : arrayListU) {
                if (bundle2 != null) {
                    Bundle bundle3 = bundle2.getBundle("value");
                    yko0 yko0Var = null;
                    if (bundle3 != null) {
                        switch (bundle3.getInt("_type")) {
                            case 1:
                                Instant instantOfEpochMilli = bundle3.containsKey("zeroTime") ? Instant.ofEpochMilli(bundle3.getLong("zeroTime")) : null;
                                Long lValueOf = bundle3.containsKey("zeroElapsedRealtime") ? Long.valueOf(bundle3.getLong("zeroElapsedRealtime")) : null;
                                Duration durationOfMillis = bundle3.containsKey("pausedDuration") ? Duration.ofMillis(bundle3.getLong("pausedDuration")) : null;
                                xko0Var = (instantOfEpochMilli != null || lValueOf != null || durationOfMillis != null) ? new xko0(instantOfEpochMilli, lValueOf, durationOfMillis, bundle3.getBoolean("countDown"), bundle3.getInt("format")) : null;
                                break;
                            case 2:
                                LocalDate localDateOfEpochDay = bundle3.containsKey("value") ? LocalDate.ofEpochDay(bundle3.getLong("value")) : null;
                                xko0Var = localDateOfEpochDay != null ? new rko0(bundle3.getInt("format", 0), localDateOfEpochDay) : null;
                                break;
                            case 3:
                                LocalTime localTimeOfSecondOfDay = bundle3.containsKey("value") ? LocalTime.ofSecondOfDay(bundle3.getLong("value")) : null;
                                xko0Var = localTimeOfSecondOfDay != null ? new vko0(localTimeOfSecondOfDay) : null;
                                break;
                            case 4:
                                xko0Var = new tko0(bundle3.getInt("value"), bundle3.getString("unit"));
                                break;
                            case 5:
                                xko0Var = new sko0(bundle3.getFloat("value"), bundle3.getInt("minDigits", 0), bundle3.getInt("maxDigits", 2), bundle3.getString("unit"));
                                break;
                            case 6:
                                xko0Var = new uko0(bundle3.getString("value", ""), bundle3.getString("unit"));
                                break;
                            default:
                                xko0Var = null;
                                break;
                        }
                        if (xko0Var != null) {
                            yko0Var = new yko0(xko0Var, bundle2.getString("label"), bundle2.getInt("semanticStyle", 0));
                        }
                    }
                    if (yko0Var != null) {
                        arrayList.add(yko0Var);
                    }
                }
            }
        }
        this.f = bundle.getInt("android.metrics.criticalIndex", 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alo0)) {
            return false;
        }
        alo0 alo0Var = (alo0) obj;
        if (this == alo0Var) {
            return true;
        }
        return this.e.equals(alo0Var.e) && this.f == alo0Var.f;
    }

    public final int hashCode() {
        return Objects.hash(this.e, Integer.valueOf(this.f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetricStyle{mMetrics=");
        sb.append(this.e);
        sb.append(", mCriticalMetric=");
        return gvg.j(sb, this.f, "}");
    }
}
