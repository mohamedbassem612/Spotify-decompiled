package p;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class etr implements o2r {
    public o2r X;
    public final Context a;
    public final ArrayList b;
    public final o2r c;
    public s320 d;
    public s57 e;
    public hsl f;
    public o2r g;
    public vch1 h;
    public a2r i;
    public bwz0 t;

    public etr(Context context, o2r o2rVar) {
        this.a = context.getApplicationContext();
        o2rVar.getClass();
        this.c = o2rVar;
        this.b = new ArrayList();
    }

    public static void i(o2r o2rVar, yeg1 yeg1Var) {
        if (o2rVar != null) {
            o2rVar.a(yeg1Var);
        }
    }

    @Override // p.o2r
    public final void a(yeg1 yeg1Var) {
        yeg1Var.getClass();
        this.c.a(yeg1Var);
        this.b.add(yeg1Var);
        i(this.d, yeg1Var);
        i(this.e, yeg1Var);
        i(this.f, yeg1Var);
        i(this.g, yeg1Var);
        i(this.h, yeg1Var);
        i(this.i, yeg1Var);
        i(this.t, yeg1Var);
    }

    public final void c(o2r o2rVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            o2rVar.a((yeg1) arrayList.get(i));
            i++;
        }
    }

    @Override // p.o2r
    public final void close() {
        o2r o2rVar = this.X;
        if (o2rVar != null) {
            try {
                o2rVar.close();
            } finally {
                this.X = null;
            }
        }
    }

    @Override // p.o2r
    public final Map e() {
        o2r o2rVar = this.X;
        return o2rVar == null ? Collections.EMPTY_MAP : o2rVar.e();
    }

    @Override // p.o2r
    public final Uri getUri() {
        o2r o2rVar = this.X;
        if (o2rVar == null) {
            return null;
        }
        return o2rVar.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        o2r o2rVar = this.X;
        o2rVar.getClass();
        return o2rVar.read(bArr, i, i2);
    }

    @Override // p.o2r
    public final long t(n3r n3rVar) {
        o2r o2rVar;
        dm5.y(this.X == null);
        Uri uri = n3rVar.a;
        String scheme = uri.getScheme();
        String str = zoi1.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    s320 s320Var = new s320(false);
                    this.d = s320Var;
                    c(s320Var);
                }
                o2rVar = this.d;
                this.X = o2rVar;
            } else {
                if (this.e == null) {
                    s57 s57Var = new s57(context);
                    this.e = s57Var;
                    c(s57Var);
                }
                o2rVar = this.e;
                this.X = o2rVar;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                s57 s57Var2 = new s57(context);
                this.e = s57Var2;
                c(s57Var2);
            }
            o2rVar = this.e;
            this.X = o2rVar;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                hsl hslVar = new hsl(context);
                this.f = hslVar;
                c(hslVar);
            }
            o2rVar = this.f;
            this.X = o2rVar;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            o2r o2rVar2 = this.c;
            if (zEquals) {
                o2rVar = this.g;
                if (o2rVar == null) {
                    try {
                        o2r o2rVar3 = (o2r) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = o2rVar3;
                        c(o2rVar3);
                    } catch (ClassNotFoundException unused) {
                        oon1.H("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        bhn0.o("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    o2r o2rVar4 = this.g;
                    if (o2rVar4 == null) {
                        this.g = o2rVar2;
                    } else {
                        o2rVar2 = o2rVar4;
                    }
                    o2rVar = o2rVar2;
                }
                this.X = o2rVar;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    vch1 vch1Var = new vch1();
                    this.h = vch1Var;
                    c(vch1Var);
                }
                o2rVar = this.h;
                this.X = o2rVar;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    a2r a2rVar = new a2r(false);
                    this.i = a2rVar;
                    c(a2rVar);
                }
                o2rVar = this.i;
                this.X = o2rVar;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.t == null) {
                    bwz0 bwz0Var = new bwz0(context);
                    this.t = bwz0Var;
                    c(bwz0Var);
                }
                o2rVar = this.t;
                this.X = o2rVar;
            } else {
                this.X = o2rVar2;
                o2rVar = o2rVar2;
            }
        }
        return o2rVar.t(n3rVar);
    }
}
