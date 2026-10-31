package p;

import android.graphics.Bitmap;
import android.media.Image;
import android.text.SpannableStringBuilder;
import androidx.car.app.model.Alert;
import io.reactivex.rxjava3.functions.Function;
import java.nio.ByteBuffer;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class azj implements xae1, Function, dcp1 {
    public final long a;
    public final Object b;
    public final Object c;
    public Object d;

    public azj(long j, qlr qlrVar) {
        this.a = j;
        this.b = qlrVar;
        this.c = Pattern.compile("\\(((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\)");
        this.d = Pattern.compile("\\(((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\s?-\\s?((?:(?:\\d+:[0-5]\\d:)|(?:\\d+:))[0-5]\\d)\\)");
    }

    public int a(String str) {
        return vgo1.i(str, (lee1) this.b, this.a, (wat) this.c, (f930) this.d).d.g;
    }

    public Object apply(Object obj) {
        return ((mcu0) this.b).a((String) this.c, (String) this.d, (ege0) obj, this.a, false);
    }

    public void b(SpannableStringBuilder spannableStringBuilder, Matcher matcher, int i) {
        String strGroup = matcher.group(i);
        long j = -1;
        if (strGroup != null) {
            String[] strArrSplit = strGroup.split(":");
            long j2 = 0;
            for (int length = strArrSplit.length - 1; length >= 0; length--) {
                try {
                    j2 = (long) ((Long.parseLong(strArrSplit[length]) * Math.pow(60.0d, (strArrSplit.length - 1) - length) * 1000.0d) + j2);
                } catch (NumberFormatException unused) {
                }
            }
            j = j2;
        }
        if (j < 0 || j > this.a) {
            return;
        }
        spannableStringBuilder.setSpan(new yoe1(this, j), matcher.start(i), matcher.end(i), 33);
    }

    public jcp1 zza() {
        int iLimit;
        szo1 szo1Var;
        lce1 lce1Var = (lce1) this.b;
        long j = this.a;
        q0p1 q0p1Var = (q0p1) this.c;
        mj80 mj80Var = (mj80) this.d;
        fqn1 fqn1Var = new fqn1((byte) 11);
        e821 e821Var = new e821();
        e821Var.b = Long.valueOf(j & Long.MAX_VALUE);
        e821Var.a = q0p1Var;
        e821Var.c = Boolean.valueOf(lce1.i);
        Boolean bool = Boolean.TRUE;
        e821Var.d = bool;
        e821Var.e = bool;
        fqn1Var.b = new b0p1(e821Var);
        int i = mj80Var.g;
        if (i == -1) {
            Bitmap bitmap = mj80Var.a;
            zod.s(bitmap);
            iLimit = bitmap.getAllocationByteCount();
        } else if (i == 17 || i == 842094169) {
            ByteBuffer byteBuffer = mj80Var.b;
            zod.s(byteBuffer);
            iLimit = byteBuffer.limit();
        } else if (i != 35) {
            iLimit = 0;
        } else {
            Image.Plane[] planeArrC = mj80Var.c();
            zod.s(planeArrC);
            iLimit = (planeArrC[0].getBuffer().limit() * 3) / 2;
        }
        bym1 bym1Var = new bym1((byte) 13);
        if (i == -1) {
            szo1Var = szo1.g;
        } else if (i == 35) {
            szo1Var = szo1.f;
        } else if (i == 842094169) {
            szo1Var = szo1.e;
        } else if (i != 16) {
            szo1Var = i != 17 ? szo1.b : szo1.d;
        } else {
            szo1Var = szo1.c;
        }
        bym1Var.b = szo1Var;
        bym1Var.c = Integer.valueOf(iLimit & Alert.DURATION_SHOW_INDEFINITELY);
        fqn1Var.c = new vzo1(bym1Var);
        dmj1 dmj1Var = new dmj1((byte) 16);
        kce1 kce1Var = lce1Var.g;
        dmj1Var.b = e8p1.b;
        fqn1Var.d = new g8p1(dmj1Var);
        t7p1 t7p1Var = new t7p1(fqn1Var);
        ikj1 ikj1Var = new ikj1();
        ikj1Var.c = kce1Var.a() ? p0p1.c : p0p1.b;
        ikj1Var.d = t7p1Var;
        return new jcp1(ikj1Var, 0);
    }

    public /* synthetic */ azj(lce1 lce1Var, long j, q0p1 q0p1Var, mj80 mj80Var) {
        this.b = lce1Var;
        this.a = j;
        this.c = q0p1Var;
        this.d = mj80Var;
    }

    public azj(lee1 lee1Var, wat watVar, long j, f930 f930Var) {
        this.b = lee1Var;
        this.c = watVar;
        this.a = j;
        this.d = f930Var;
    }

    public azj(mcu0 mcu0Var, String str, String str2, long j) {
        this.b = mcu0Var;
        this.c = str;
        this.d = str2;
        this.a = j;
    }

    public azj(long j, ifb1 ifb1Var) {
        this.a = j;
        this.b = ifb1Var;
        String str = zoi1.a;
        this.c = Executors.newSingleThreadScheduledExecutor(new ask("WatchdogTimer", (byte) 2));
    }
}
