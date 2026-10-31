package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hvh0 {
    public final Bundle a;
    public final Boolean b;
    public dwh0 c;

    public hvh0(dwh0 dwh0Var, boolean z, boolean z2) {
        if (dwh0Var == null) {
            hhg1.n("selector must not be null");
            throw null;
        }
        if (!z && z2) {
            hhg1.n("shouldScanWithScreenOff can not be true when activeScan is false");
            throw null;
        }
        Bundle bundle = new Bundle();
        this.a = bundle;
        this.c = dwh0Var;
        this.b = Boolean.valueOf(z2);
        bundle.putBundle("selector", dwh0Var.a);
        bundle.putBoolean("activeScan", z);
    }

    public final void a() {
        if (this.c == null) {
            Bundle bundle = this.a.getBundle("selector");
            dwh0 dwh0Var = null;
            if (bundle != null) {
                dwh0Var = new dwh0(bundle, null);
            } else {
                dwh0 dwh0Var2 = dwh0.c;
            }
            this.c = dwh0Var;
            if (dwh0Var == null) {
                this.c = dwh0.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean c() {
        a();
        dwh0 dwh0Var = this.c;
        dwh0Var.a();
        return !dwh0Var.b.contains(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hvh0) {
            hvh0 hvh0Var = (hvh0) obj;
            a();
            dwh0 dwh0Var = this.c;
            hvh0Var.a();
            if (dwh0Var.equals(hvh0Var.c) && b() == hvh0Var.b() && this.b.booleanValue() == hvh0Var.b.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a();
        int iHashCode = this.c.hashCode() ^ (b() ? 1 : 0);
        boolean zBooleanValue = this.b.booleanValue();
        return (zBooleanValue ? 1 : 0) ^ (iHashCode == true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.c);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        sb.append(c());
        sb.append(", shouldScanWithScreenOff= ");
        sb.append(this.b.booleanValue());
        sb.append(" }");
        return sb.toString();
    }

    public hvh0(Bundle bundle) {
        this.a = bundle;
        this.b = Boolean.FALSE;
    }
}
