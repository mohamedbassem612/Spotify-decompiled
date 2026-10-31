package p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qp7 {
    public static final bg11 e;
    public static final qp7 f;
    public static final bg11 g;
    public static final j380 h;
    public final SparseArray a = new SparseArray();
    public final int b;
    public final b380 c;
    public final b380 d;

    static {
        bg11 bg11VarT = b380.t(12);
        e = bg11VarT;
        f = new qp7(b380.t(pp7.d), bg11VarT, bg11.e);
        Object[] objArr = {2, 5, 6};
        i8p1.m(objArr);
        g = b380.l(3, objArr);
        h380 h380Var = new h380(4);
        h380Var.e(5, 6);
        h380Var.e(17, 6);
        h380Var.e(7, 6);
        h380Var.e(30, 10);
        h380Var.e(18, 6);
        h380Var.e(6, 8);
        h380Var.e(8, 8);
        h380Var.e(14, 8);
        h = h380Var.b(true);
    }

    public qp7(bg11 bg11Var, List list, List list2) {
        for (int i = 0; i < bg11Var.d; i++) {
            pp7 pp7Var = (pp7) bg11Var.get(i);
            this.a.put(pp7Var.a, pp7Var);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            iMax = Math.max(iMax, ((pp7) this.a.valueAt(i2)).b);
        }
        this.b = iMax;
        this.c = b380.p(list);
        this.d = b380.p(list2);
    }

    public static bg11 a(int i, int[] iArr) {
        v280 v280VarM = b380.m();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            v280VarM.c(new pp7(i2, i));
        }
        return v280VarM.g();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    public static qp7 b(Context context, Intent intent, po7 po7Var, AudioDeviceInfo audioDeviceInfo, List list) {
        AudioManager audioManagerU = kw7.u(context);
        if (audioDeviceInfo == null) {
            audioDeviceInfo = Build.VERSION.SDK_INT >= 33 ? gg.j(audioManagerU, po7Var) : null;
        }
        b380 b380VarB = audioDeviceInfo != null ? doa1.b(audioDeviceInfo) : e;
        if (Build.VERSION.SDK_INT >= 33 && (zoi1.T(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            return gg.h(audioManagerU, po7Var, b380VarB, list);
        }
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo == null ? audioManagerU.getDevices(2) : new AudioDeviceInfo[]{audioDeviceInfo}) {
            if (aym.u(audioDeviceInfo2.getType())) {
                return new qp7(b380.t(pp7.d), b380VarB, list);
            }
        }
        r380 r380Var = new r380(4);
        r380Var.g(2);
        if (Build.VERSION.SDK_INT >= 29 && (zoi1.T(context) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"))) {
            r380Var.h(x74.F(po7Var));
            return new qp7(a(10, bmq0.b0(r380Var.i())), b380VarB, list);
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (str.equals("Amazon") || str.equals("Xiaomi")) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    r380Var.h(g);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            r380Var.h(g);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new qp7(a(10, bmq0.b0(r380Var.i())), b380VarB, list);
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            r380Var.h(bmq0.f(intArrayExtra));
        }
        return new qp7(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), bmq0.b0(r380Var.i())), b380VarB, list);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    public final Pair c(po7 po7Var, ie30 ie30Var) {
        String str = ie30Var.f66p;
        int iX = ie30Var.K;
        int i = ie30Var.J;
        str.getClass();
        int iD = asj0.d(str, ie30Var.l);
        Integer numValueOf = Integer.valueOf(iD);
        j380 j380Var = h;
        if (!j380Var.containsKey(numValueOf)) {
            return null;
        }
        int i2 = 6;
        SparseArray sparseArray = this.a;
        if (iD == 18 && !zoi1.l(sparseArray, 18)) {
            iD = 6;
        } else if ((iD == 8 && !zoi1.l(sparseArray, 8)) || (iD == 30 && !zoi1.l(sparseArray, 30))) {
            iD = 7;
        }
        if (!zoi1.l(sparseArray, iD)) {
            return null;
        }
        pp7 pp7Var = (pp7) sparseArray.get(iD);
        pp7Var.getClass();
        int iIntValue = pp7Var.b;
        t380 t380Var = pp7Var.c;
        boolean zContains = false;
        if (i == -1 || iD == 18) {
            int i3 = ie30Var.L;
            if (i3 == -1) {
                i3 = 48000;
            }
            int i4 = pp7Var.a;
            if (t380Var == null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    iIntValue = x74.O(i4, i3, po7Var);
                } else {
                    Object obj = j380Var.get(Integer.valueOf(i4));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
        } else {
            if (!ie30Var.f66p.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
                pp7 pp7Var2 = pp7.d;
                if (t380Var != null) {
                    int iX2 = iX != -1 ? iX : zoi1.x(i);
                    if (iX2 != 0) {
                        zContains = t380Var.contains(Integer.valueOf(iX2));
                    }
                } else if (i <= iIntValue) {
                    zContains = true;
                }
                if (!zContains) {
                    return null;
                }
            } else if (i > 10) {
                return null;
            }
            iIntValue = i;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            i2 = iIntValue;
        } else if (iIntValue == 7) {
            i2 = 8;
        } else if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5) {
            i2 = iIntValue;
        }
        HashSet hashSet = hph0.a;
        if (i5 <= 26 && "fugu".equals(Build.DEVICE) && i2 == 1) {
            i2 = 2;
        }
        if (iX == -1 || i != i2) {
            iX = zoi1.x(i2);
        }
        if (iX == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iD), Integer.valueOf(iX));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp7)) {
            return false;
        }
        qp7 qp7Var = (qp7) obj;
        return zoi1.n(this.a, qp7Var.a) && this.b == qp7Var.b && Objects.equals(this.c, qp7Var.c) && Objects.equals(this.d, qp7Var.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((zoi1.o(this.a) + (this.b * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + ", speakerLayoutChannelMasks=" + this.c + ", spatializerChannelMasks=" + this.d + "]";
    }
}
