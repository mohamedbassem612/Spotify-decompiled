package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF59' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fd01 {
    public static final rtw0 d;
    public static final fd01 e;
    public static final /* synthetic */ fd01[] f;
    public static final /* synthetic */ t0z g;
    public final FontFamily a;
    public final String b;
    public final String c;

    /* JADX INFO: Fake field, exist only in values array */
    fd01 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    fd01 EF59;

    static {
        FontWeight fontWeight = FontWeight.b;
        fd01 fd01Var = new fd01("Spotify", 0, hm5.d(o0c.b(2131296269, w8p1.s()), o0c.b(2131296262, w8p1.q())), "", "");
        zh40 zh40Var = FontFamily.c;
        fd01[] fd01VarArr = {fd01Var, new fd01("Lora", 1, zh40Var, "https://github.com/google/fonts/raw/main/ofl/lora/Lora%5Bwght%5D.ttf", "lora.ttf"), new fd01("Bitter", 2, zh40Var, "https://github.com/google/fonts/raw/main/ofl/bitter/Bitter%5Bwght%5D.ttf", "bitter.ttf"), new fd01("IbmPlexSans", 3, FontFamily.b, "https://raw.githubusercontent.com/IBM/plex/main/packages/plex-sans/fonts/complete/ttf/IBMPlexSans-Regular.ttf", "ibm_plex_sans.ttf")};
        f = fd01VarArr;
        g = new t0z(fd01VarArr);
        d = new rtw0((byte) 18);
        e = fd01Var;
    }

    public fd01(String str, int i, FontFamily fontFamily, String str2, String str3) {
        super(str, i);
        this.a = fontFamily;
        this.b = str2;
        this.c = str3;
    }

    public static fd01 valueOf(String str) {
        return (fd01) Enum.valueOf(fd01.class, str);
    }

    public static fd01[] values() {
        return (fd01[]) f.clone();
    }
}
