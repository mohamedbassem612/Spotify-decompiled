package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kma implements bpa {
    public final zv81 a;
    public final jma b;
    public final wpc c;

    public kma(l270 l270Var, File file, long j) {
        zv81 zv81Var = new zv81(file, new axb0(j), null, true);
        this.a = zv81Var;
        jma jmaVar = new jma((byte) 0);
        this.b = jmaVar;
        wpc wpcVar = new wpc();
        wpcVar.a = zv81Var;
        wpcVar.c = jmaVar;
        dzp0 dzp0Var = new dzp0(((yyp0) l270Var).c(), (byte) 1);
        dzp0Var.d = null;
        wpcVar.e = dzp0Var;
        this.c = wpcVar;
    }

    @Override // p.bpa
    public final zv81 a() {
        return this.a;
    }

    public final boolean b(String str) {
        boolean z;
        String strA = this.b.a(new n3r(Uri.parse(str)));
        try {
            long jA = hyl.a(this.a.g(strA));
            if (jA <= 0) {
                return false;
            }
            zv81 zv81Var = this.a;
            synchronized (zv81Var) {
                dm5.y(!zv81Var.i);
                ysc yscVarM = zv81Var.c.m(strA);
                z = yscVarM != null && yscVarM.b(0L, jA) >= jA;
            }
            return z;
        } catch (Exception e) {
            Logger.l(e, String.format("Unable to determine if media %s was cached.", Arrays.copyOf(new Object[]{str}, 1)), new Object[0]);
            return false;
        }
    }
}
