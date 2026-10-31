package p;

import android.net.Uri;
import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jru extends i471 {
    public final zeu a;
    public final rjn b;
    public final rm5 c;
    public final c9 d = mqo1.s(new yy61[]{yy61.IMAGE, yy61.VIDEO});
    public final xj61 e;
    public final f471 f;

    public jru(zeu zeuVar, rjn rjnVar, rm5 rm5Var) {
        this.a = zeuVar;
        this.b = rjnVar;
        this.c = rm5Var;
        p471 p471Var = p471.d;
        xj61 xj61Var = new xj61();
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            xj61Var.add(new mmr0("android.permission.WRITE_EXTERNAL_STORAGE", Boolean.TRUE));
        }
        if (i >= 33) {
            xj61Var.add(new mmr0("android.permission.POST_NOTIFICATIONS", Boolean.FALSE));
        }
        this.e = cwl1.j(xj61Var);
        this.f = new f471(tmx.c);
    }

    public final o571 a() {
        return p471.d;
    }

    public final c9 b() {
        return this.d;
    }

    public final int c() {
        return 2131962206;
    }

    public final hyo1 d() {
        return this.f;
    }

    public final int e() {
        return 2131962205;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.i471
    public final Object f(r571 r571Var, lnm lnmVar) throws Exception {
        hru hruVar;
        if (lnmVar instanceof hru) {
            hruVar = (hru) lnmVar;
            int i = hruVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hruVar.d = i - Integer.MIN_VALUE;
            } else {
                hruVar = new hru(this, (onm) lnmVar);
            }
        } else {
            hruVar = new hru(this, (onm) lnmVar);
        }
        Object obj = hruVar.b;
        int i2 = hruVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            p371 p371Var = r571Var.a;
            if (p371Var instanceof pz70) {
                hruVar.a = r571Var;
                hruVar.d = 1;
                Uri uri = ((pz70) p371Var).a;
                if (uri == null) {
                    hhg1.n("No image to download");
                    return null;
                }
                zeu zeuVar = this.a;
                Object objY = fn31.Y((q8n) zeuVar.c, new p1r(zeuVar, uri, (lnm) null, (byte) 11), hruVar);
                if (objY != d9nVar) {
                    objY = rih1Var;
                }
                if (objY != d9nVar) {
                }
            } else {
                if (!(p371Var instanceof h9c1)) {
                    bhn0.B(rc11.a.b(p371Var.getClass()).r(), "Unsupported share data type for download: ");
                    return null;
                }
                hruVar.a = r571Var;
                hruVar.d = 2;
                String path = Uri.parse(((h9c1) p371Var).b.e).getPath();
                if (path == null) {
                    eg.m("Video file path is null");
                    return null;
                }
                File file = new File(path);
                if (!file.exists()) {
                    bhn0.f(l1d.m("Video file does not exist: ", file.getAbsolutePath()));
                    return null;
                }
                Object objA = ((n58) this.b.b).a(file, hruVar);
                if (objA != d9nVar) {
                    objA = rih1Var;
                }
                if (objA != d9nVar) {
                }
            }
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r571Var = hruVar.a;
        hm5.M(obj);
        yn71 yn71Var = r571Var.b;
        hruVar.a = null;
        hruVar.d = 3;
        rm5 rm5Var = this.c;
        Object objH = c921.H((q8n) rm5Var.b, new eum(rm5Var, yn71Var, (lnm) null, (byte) 1), hruVar);
        if (objH != d9nVar) {
            objH = rih1Var;
        }
        return objH == d9nVar ? d9nVar : rih1Var;
    }
}
