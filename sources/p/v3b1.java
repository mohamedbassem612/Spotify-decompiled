package p;

import android.media.MediaCodecInfo;
import android.os.Process;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v3b1 extends hab0 implements iu30 {
    public static final v3b1 N0;
    public static final v3b1 O0;
    public static final v3b1 P0;
    public static final v3b1 Q0;
    public static final v3b1 R0;
    public static final v3b1 S0;
    public static final v3b1 T0;
    public static final v3b1 U0;
    public static final v3b1 V0;
    public static final v3b1 W0;
    public static final v3b1 X;
    public static final v3b1 X0;
    public static final v3b1 Y;
    public static final v3b1 Y0;
    public static final v3b1 Z;
    public static final v3b1 Z0;
    public static final v3b1 a1;
    public static final v3b1 b;
    public static final v3b1 b1;
    public static final v3b1 c;
    public static final v3b1 c1;
    public static final v3b1 d;
    public static final v3b1 d1;
    public static final v3b1 e;
    public static final v3b1 e1;
    public static final v3b1 f;
    public static final v3b1 g;
    public static final v3b1 h;
    public static final v3b1 i;
    public static final v3b1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new v3b1(i2, (byte) 0);
        c = new v3b1(i2, (byte) 1);
        d = new v3b1(i2, (byte) 2);
        e = new v3b1(i2, (byte) 3);
        f = new v3b1(i2, (byte) 4);
        g = new v3b1(i2, (byte) 5);
        h = new v3b1(i2, (byte) 6);
        i = new v3b1(i2, (byte) 7);
        t = new v3b1(i2, (byte) 8);
        X = new v3b1(i2, (byte) 9);
        Y = new v3b1(i2, (byte) 10);
        Z = new v3b1(i2, (byte) 11);
        N0 = new v3b1(i2, (byte) 12);
        O0 = new v3b1(i2, (byte) 13);
        P0 = new v3b1(i2, (byte) 14);
        Q0 = new v3b1(i2, (byte) 15);
        R0 = new v3b1(i2, (byte) 16);
        S0 = new v3b1(i2, (byte) 17);
        T0 = new v3b1(i2, (byte) 18);
        U0 = new v3b1(i2, (byte) 19);
        V0 = new v3b1(i2, (byte) 20);
        W0 = new v3b1(i2, (byte) 21);
        X0 = new v3b1(i2, (byte) 22);
        Y0 = new v3b1(i2, (byte) 23);
        Z0 = new v3b1(i2, (byte) 24);
        a1 = new v3b1(i2, (byte) 25);
        b1 = new v3b1(i2, (byte) 26);
        c1 = new v3b1(i2, (byte) 27);
        d1 = new v3b1(i2, (byte) 28);
        e1 = new v3b1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3b1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((r2t) obj).o();
            case 1:
                return i1o1.k((String) obj, nne.a);
            case 2:
                for (String str : ((MediaCodecInfo) obj).getSupportedTypes()) {
                    if (nhc1.S(str, "video/av01", true)) {
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 3:
                try {
                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = ((MediaCodecInfo) obj).getCapabilitiesForType("video/av01").profileLevels;
                    ArrayList arrayList = new ArrayList(codecProfileLevelArr.length);
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        arrayList.add(new mmr0(Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)));
                    }
                    return new i46(arrayList, (byte) 1);
                } catch (IllegalArgumentException unused) {
                    return v7x.a;
                }
            case 4:
                return Integer.valueOf(Arrays.hashCode((byte[]) obj));
            case 5:
                Process.killProcess(Process.myPid());
                return rih1Var;
            case 6:
                u7b1 u7b1VarK = ((kb61) obj).k();
                u7b1VarK.a(u7b1VarK.e);
                return rih1Var;
            case 7:
                return (String) obj;
            case 8:
                up70 up70VarA = ((xkk1) obj).a.a(vp70.d);
                if (up70VarA != null) {
                    return up70VarA.a.a;
                }
                return null;
            case 9:
                return Boolean.valueOf(obj instanceof xkk1);
            case 10:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 11:
                return (String) obj;
            case 12:
                up70 up70VarA2 = ((xkk1) obj).a.a(vp70.e);
                if (up70VarA2 != null) {
                    return up70VarA2.a.a;
                }
                return null;
            case 13:
                return Boolean.valueOf(obj instanceof xkk1);
            case 14:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 15:
                return ((z9b1) obj).a;
            case 16:
                return o7h.o1((ArrayList) obj);
            case 17:
                n57.s("Core Thread not found among " + ((Number) obj).intValue() + " threads; CoreThreadingService starts it in the background scope before daemons do");
                return rih1Var;
            case 18:
                return Boolean.TRUE;
            case 19:
                return new mcb1(((cxc0) obj).f.a);
            case 20:
                b261.c((e261) obj);
                return rih1Var;
            case 21:
                return (qxc0) obj;
            case 22:
                return new iq00(((cxc0) obj).f.c);
            case 23:
                return Boolean.valueOf(obj instanceof qxc0);
            case 24:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 25:
                return new qcb1(((mcb1) obj).a, "", "", false, false, true, false, false, ncb1.a, iy50.a);
            case 26:
                String str2 = ((lbh1) obj).e;
                if (str2 == null || ihc1.y0(str2)) {
                    return null;
                }
                return str2;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return rih1Var;
            case 28:
                return new n0q0(((cxc0) obj).f.a, l0q0.d);
            default:
                return new qet0(((cxc0) obj).f.a, false, false, new net0(8, false), 22);
        }
    }
}
