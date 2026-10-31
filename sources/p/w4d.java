package p;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w4d {
    public final StringBuilder a = new StringBuilder();
    public final Object b;
    public int c;
    public final fdc d;
    public final HashMap e;
    public int f;

    public w4d(fdc fdcVar) {
        Object obj = new Object();
        this.b = obj;
        this.e = new HashMap();
        this.c = 1;
        synchronized (obj) {
            this.d = fdcVar;
            this.f = this.c;
        }
    }

    public static void c(p1d p1dVar, m3d m3dVar) {
        if (mif1.g()) {
            mif1.h(m3dVar.ordinal(), "CX:State[" + p1dVar + "]");
        }
    }

    public final v4d a(String str) {
        HashMap map = this.e;
        for (c2d c2dVar : map.keySet()) {
            if (str.equals(c2dVar.a().b())) {
                return (v4d) map.get(c2dVar);
            }
        }
        return null;
    }

    public final void b() {
        boolean zY = j2h1.y("CameraStateRegistry");
        StringBuilder sb = this.a;
        if (zY) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.e.entrySet()) {
            if (j2h1.y("CameraStateRegistry")) {
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((c2d) entry.getKey()).toString(), ((v4d) entry.getValue()).a != null ? ((v4d) entry.getValue()).a.toString() : "UNKNOWN"));
            }
            m3d m3dVar = ((v4d) entry.getValue()).a;
            if (m3dVar != null && m3dVar.a) {
                i++;
            }
        }
        if (j2h1.y("CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            sb.append(l1d.j(i, this.c, "Open count: ", " (Max allowed: ", ")"));
            j2h1.o("CameraStateRegistry");
        }
        this.f = Math.max(this.c - i, 0);
    }

    public final boolean d(p1d p1dVar) {
        boolean z;
        synchronized (this.b) {
            try {
                v4d v4dVar = (v4d) this.e.get(p1dVar);
                o0c.p(v4dVar, "Camera must first be registered with registerCamera()");
                z = true;
                if (j2h1.y("CameraStateRegistry")) {
                    this.a.setLength(0);
                    StringBuilder sb = this.a;
                    Locale locale = Locale.US;
                    int i = this.f;
                    m3d m3dVar = v4dVar.a;
                    boolean z2 = m3dVar != null && m3dVar.a;
                    sb.append("tryOpenCamera(" + p1dVar + ") [Available Cameras: " + i + ", Already Open: " + z2 + " (Previous state: " + v4dVar.a + ")]");
                }
                if (this.f > 0) {
                    m3d m3dVar2 = m3d.OPENING;
                    v4dVar.a = m3dVar2;
                    c(p1dVar, m3dVar2);
                } else {
                    m3d m3dVar3 = v4dVar.a;
                    if (m3dVar3 != null && m3dVar3.a) {
                        m3d m3dVar4 = m3d.OPENING;
                        v4dVar.a = m3dVar4;
                        c(p1dVar, m3dVar4);
                    } else {
                        z = false;
                    }
                }
                if (j2h1.y("CameraStateRegistry")) {
                    StringBuilder sb2 = this.a;
                    Locale locale2 = Locale.US;
                    sb2.append(" --> ".concat(z ? "SUCCESS" : "FAIL"));
                    j2h1.o("CameraStateRegistry");
                }
                if (z) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(String str, String str2) {
        synchronized (this.b) {
            try {
                boolean z = true;
                if (this.d.b != 2) {
                    return true;
                }
                v4d v4dVarA = a(str);
                m3d m3dVar = v4dVarA != null ? v4dVarA.a : null;
                v4d v4dVarA2 = str2 != null ? a(str2) : null;
                m3d m3dVar2 = v4dVarA2 != null ? v4dVarA2.a : null;
                m3d m3dVar3 = m3d.OPEN;
                boolean z2 = m3dVar3.equals(m3dVar) || m3d.CONFIGURED.equals(m3dVar);
                boolean z3 = m3dVar3.equals(m3dVar2) || m3d.CONFIGURED.equals(m3dVar2);
                if (!z2 || !z3) {
                    z = false;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
