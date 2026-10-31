package p;

import android.os.Parcel;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class kpo1 implements vy11 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pxo1 b;
    public final /* synthetic */ String[] c;

    public /* synthetic */ kpo1(pxo1 pxo1Var, String[] strArr, byte b) {
        this.a = b;
        this.b = pxo1Var;
        this.c = strArr;
    }

    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        String[] strArr = this.c;
        pxo1 pxo1Var = this.b;
        bsd1 bsd1Var = (bsd1) obj2;
        mzo1 mzo1Var = (mzo1) obj;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                mh70 dfo1Var = new dfo1(pxo1Var, bsd1Var, (byte) 0);
                whn1 whn1VarN = mzo1Var.n();
                hi5 hi5VarA = oho1.A();
                Parcel parcelA1 = whn1VarN.a1();
                osn1.c(parcelA1, dfo1Var);
                parcelA1.writeStringArray(strArr);
                osn1.b(parcelA1, hi5VarA);
                whn1VarN.d1(6, parcelA1);
                break;
            default:
                mh70 dfo1Var2 = new dfo1(pxo1Var, bsd1Var, (byte) 1);
                whn1 whn1VarN2 = mzo1Var.n();
                hi5 hi5VarA2 = oho1.A();
                Parcel parcelA2 = whn1VarN2.a1();
                osn1.c(parcelA2, dfo1Var2);
                parcelA2.writeStringArray(strArr);
                osn1.b(parcelA2, hi5VarA2);
                whn1VarN2.d1(7, parcelA2);
                break;
        }
    }
}
