package p;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yeb0 implements lk70, ig70 {
    public static final String[] c = {"", "k", "m", "b", "t"};
    public final /* synthetic */ byte a = 0;
    public DecimalFormat b;

    public yeb0(int i) {
        d(i);
    }

    public String a(float f, wc9 wc9Var) {
        return c(f).concat("");
    }

    @Override // p.lk70
    public final String b(float f) {
        switch (this.a) {
            case 0:
                return c(f).concat("");
            default:
                return this.b.format(f);
        }
    }

    public String c(double d) {
        String str = this.b.format(d);
        int numericValue = Character.getNumericValue(str.charAt(str.length() - 1));
        String strReplaceAll = str.replaceAll("E[0-9][0-9]", c[Integer.valueOf(Character.getNumericValue(str.charAt(str.length() - 2)) + "" + numericValue).intValue() / 3]);
        while (true) {
            if (strReplaceAll.length() <= 5 && !strReplaceAll.matches("[0-9]+\\.[a-z]")) {
                return strReplaceAll;
            }
            strReplaceAll = cy30.h(2, 0, strReplaceAll).concat(strReplaceAll.substring(strReplaceAll.length() - 1));
        }
    }

    public void d(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0) {
                stringBuffer.append(".");
            }
            stringBuffer.append("0");
        }
        this.b = new DecimalFormat("###,###,###,##0" + stringBuffer.toString());
    }

    public /* synthetic */ yeb0() {
    }
}
