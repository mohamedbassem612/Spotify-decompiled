package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aln1 extends rin1 {
    private static final aln1 zzw;
    private int zza;
    private Object zze;
    private int zzf;
    private int zzg;
    private long zzl;
    private gin1 zzm;
    private int zzn;
    private vkn1 zzo;
    private gln1 zzp;
    private akn1 zzr;
    private gin1 zzs;
    private int zzu;
    private long zzv;
    private int zzd = 0;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzq = "";
    private uin1 zzt = sin1.e;

    static {
        aln1 aln1Var = new aln1();
        zzw = aln1Var;
        rin1.m(aln1.class, aln1Var);
    }

    public static zkn1 D() {
        return (zkn1) zzw.h();
    }

    public static aln1 E() {
        return zzw;
    }

    public final /* synthetic */ void A(int i) {
        this.zzn = i - 2;
    }

    public final boolean B() {
        return (this.zza & 32) != 0;
    }

    public final int C() {
        return this.zzu;
    }

    public final /* synthetic */ void F(String str) {
        Objects.requireNonNull(str);
        this.zzh = str;
    }

    public final /* synthetic */ void G(String str) {
        Objects.requireNonNull(str);
        this.zzi = str;
    }

    public final /* synthetic */ void H(String str) {
        Objects.requireNonNull(str);
        this.zzj = str;
    }

    public final /* synthetic */ void I(gin1 gin1Var) {
        this.zzm = gin1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void J(vkn1 vkn1Var) {
        Objects.requireNonNull(vkn1Var);
        this.zzo = vkn1Var;
        this.zza |= 2;
    }

    public final /* synthetic */ void K(gln1 gln1Var) {
        this.zzp = gln1Var;
        this.zza |= 4;
    }

    public final /* synthetic */ void L(akn1 akn1Var) {
        this.zzr = akn1Var;
        this.zza |= 8;
    }

    public final void M(int i) {
        List list = this.zzt;
        boolean z = ((ohn1) list).a;
        List list2 = list;
        if (!z) {
            int size = list.size();
            sin1 sin1VarZzg = ((sin1) list).zzg(size + size);
            this.zzt = sin1VarZzg;
            list2 = sin1VarZzg;
        }
        ((sin1) list2).zzh(0);
    }

    public final /* synthetic */ void N(int i) {
        this.zza |= 32;
        this.zzu = i;
    }

    public final /* synthetic */ void O(long j) {
        this.zzv = j;
    }

    public final int P() {
        int i;
        switch (this.zzf) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                i = 13;
                break;
            case grn1.d /* 12 */:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case 19:
                i = 21;
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                i = 22;
                break;
            case 21:
                i = 23;
                break;
            case 22:
                i = 24;
                break;
            case 23:
                i = 25;
                break;
            case 24:
                i = 26;
                break;
            case 25:
                i = 27;
                break;
            case 26:
                i = 28;
                break;
            case 27:
                i = 29;
                break;
            case 28:
                i = 30;
                break;
            case 29:
                i = 31;
                break;
            case 30:
                i = 32;
                break;
            case 31:
                i = 33;
                break;
            case 32:
                i = 34;
                break;
            case 33:
                i = 35;
                break;
            case 34:
                i = 36;
                break;
            case 35:
                i = 37;
                break;
            case 36:
                i = 38;
                break;
            case 37:
                i = 39;
                break;
            case 38:
                i = 40;
                break;
            case 39:
                i = 41;
                break;
            case 40:
                i = 42;
                break;
            case 41:
                i = 43;
                break;
            case 42:
                i = 44;
                break;
            case 43:
                i = 45;
                break;
            case 44:
                i = 46;
                break;
            case 45:
                i = 47;
                break;
            case 46:
                i = 48;
                break;
            case 47:
                i = 49;
                break;
            case 48:
                i = 50;
                break;
            case 49:
                i = 51;
                break;
            case 50:
                i = 52;
                break;
            case 51:
                i = 53;
                break;
            case 52:
                i = 54;
                break;
            case 53:
                i = 55;
                break;
            case 54:
                i = 56;
                break;
            case 55:
                i = 57;
                break;
            case 56:
                i = 58;
                break;
            case 57:
                i = 59;
                break;
            case 58:
                i = 60;
                break;
            case 59:
                i = 61;
                break;
            case 60:
                i = 62;
                break;
            case 61:
                i = 63;
                break;
            case 62:
                i = 64;
                break;
            case 63:
                i = 65;
                break;
            case 64:
                i = 66;
                break;
            case 65:
                i = 67;
                break;
            case 66:
                i = 68;
                break;
            case 67:
                i = 69;
                break;
            case 68:
                i = 70;
                break;
            case 69:
                i = 71;
                break;
            case 70:
                i = 72;
                break;
            case 71:
                i = 73;
                break;
            case 72:
                i = 74;
                break;
            case 73:
                i = 75;
                break;
            case 74:
                i = 76;
                break;
            case 75:
                i = 77;
                break;
            case 76:
                i = 78;
                break;
            case 77:
                i = 79;
                break;
            case 78:
                i = 80;
                break;
            case 79:
                i = 81;
                break;
            case 80:
                i = 82;
                break;
            case 81:
                i = 83;
                break;
            case 82:
                i = 84;
                break;
            case 83:
                i = 85;
                break;
            case 84:
                i = 86;
                break;
            case 85:
                i = 87;
                break;
            case 86:
                i = 88;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzw, "\u0000\u0012\u0001\u0001\u0001\u0014\u0012\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u0003\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bȈ\tȈ\nဉ\u0000\u000bဉ\u0003\rဉ\u0004\u000eȈ\u000f<\u0000\u0011'\u0012င\u0005\u0013\f\u0014\u0002", new Object[]{"zze", "zzd", "zza", "zzf", "zzi", "zzl", "zzn", "zzo", "zzp", "zzq", "zzj", "zzk", "zzm", "zzr", "zzs", "zzh", pkn1.class, "zzt", "zzu", "zzg", "zzv"});
        }
        if (i2 == 3) {
            return new aln1();
        }
        if (i2 == 4) {
            return new zkn1(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(aln1.class);
    }

    public final gin1 x() {
        gin1 gin1Var = this.zzm;
        return gin1Var == null ? gin1.A() : gin1Var;
    }

    public final /* synthetic */ void y(int i) {
        this.zzf = i - 2;
    }

    public final /* synthetic */ void z(int i) {
        this.zzg = i - 2;
    }
}
