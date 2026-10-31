package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.chromium.net.ApiVersion;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.impl.ImplVersion;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class m7o extends ICronetEngineBuilder {
    public static final Pattern n = Pattern.compile("^[0-9\\.]*$");
    public static final int o = m0p1.v();
    public final xto1 a;
    public final Context b;
    public final LinkedList c = new LinkedList();
    public final LinkedList d = new LinkedList();
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public String l;
    public boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public m7o(Context context) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.a = a8o.w(applicationContext, y7o.d);
        boolean z = false;
        Object[] objArr = 0;
        int i = 0;
        Object[] objArr2 = 0;
        boolean z2 = true;
        try {
            this.h = z2;
            this.i = z2;
            this.j = objArr2 == true ? 1 : 0;
            a(i);
            this.m = objArr == true ? 1 : 0;
            this.e = z2;
        } finally {
            b(jUptimeMillis, z);
        }
    }

    public final void a(int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i != 1) {
            i2 = 3;
            if (i != 2) {
                if (i != 3) {
                    hhg1.n("Unknown public builder cache mode");
                    return;
                }
                i2 = 2;
            }
        } else {
            i2 = 4;
        }
        char c = 1;
        if (i2 == 1) {
            c = 0;
        } else if (i2 != 2 && i2 != 3) {
            if (i2 != 4) {
                throw null;
            }
            c = 2;
        }
        if (c == 1 && this.g == null) {
            hhg1.n("Storage path must be set");
        } else {
            this.k = i2;
        }
    }

    public final void b(long j, boolean z) {
        y7o y7oVar = y7o.d;
        xto1 xto1Var = this.a;
        if (o >= 30) {
            return;
        }
        x7o x7oVar = new x7o();
        x7oVar.e = Boolean.FALSE;
        try {
            x7oVar.b = 2;
            x7oVar.h = Process.myUid();
            x7oVar.g = new k1e(ImplVersion.getCronetVersion());
            x7oVar.d = y7oVar;
            x7oVar.f = new k1e(ApiVersion.getCronetVersion());
            x7oVar.a = getLogCronetInitializationRef();
            x7oVar.e = Boolean.valueOf(z);
        } finally {
            x7oVar.c = (int) (SystemClock.uptimeMillis() - j);
            xto1Var.A(x7oVar);
        }
    }

    public final w7o c() {
        int i;
        int i2;
        boolean z = this.e;
        boolean z2 = this.h;
        boolean z3 = this.i;
        boolean z4 = this.j;
        int iC = l1d.C(this.k);
        if (iC != 0) {
            i = 3;
            if (iC != 1) {
                if (iC == 2) {
                    i2 = 2;
                } else {
                    if (iC != 3) {
                        hhg1.n("Unknown internal builder cache mode");
                        return null;
                    }
                    i2 = 1;
                }
            }
            return new w7o(z, z2, z3, z4, i2, this.l, this.m, getLogCronetInitializationRef());
        }
        i = 0;
        i2 = i;
        return new w7o(z, z2, z3, z4, i2, this.l, this.m, getLogCronetInitializationRef());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        int i;
        Context context = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        synchronized (pno1.a) {
            i = pno1.b;
            if (i == 0) {
                try {
                    i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                    pno1.b = i;
                } catch (PackageManager.NameNotFoundException unused) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
        }
        sb.append(i);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append("; Cronet/");
        sb.append(ImplVersion.getCronetVersion());
        sb.append(')');
        return sb.toString();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public long getLogCronetInitializationRef() {
        AtomicLong atomicLong = u7a0.f45p;
        atomicLong.compareAndSet(0L, this.a.y());
        return atomicLong.get();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return Collections.unmodifiableSet(hashSet);
    }
}
