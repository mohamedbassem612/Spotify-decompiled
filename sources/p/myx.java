package p;

import com.spotify.reprise.encorethemeinstaller.EncoreThemeInstaller;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class myx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EncoreThemeInstaller b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myx(EncoreThemeInstaller encoreThemeInstaller) {
        super(2);
        this.a = (byte) 0;
        this.b = encoreThemeInstaller;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        EncoreThemeInstaller encoreThemeInstaller = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    int i = o6.t;
                    int i2 = EncoreThemeInstaller.N0;
                    encoreThemeInstaller.y(x340Var2, 8);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                encoreThemeInstaller.a((b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                int iP = czo1.p(9);
                int i3 = EncoreThemeInstaller.N0;
                encoreThemeInstaller.y((b0k) obj, iP);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myx(EncoreThemeInstaller encoreThemeInstaller, int i, byte b) {
        super(2);
        this.a = b;
        this.b = encoreThemeInstaller;
    }
}
