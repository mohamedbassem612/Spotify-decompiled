package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ht71 {
    public static final Set a = f46.S0(new String[]{"submit_report_adult_content", "submit_report_deceptive_misleading", "submit_report_dangerous_inappropriate", "submit_report_illegal_restricted", "submit_report_quality_technical"});

    public static final r32 a(String str) {
        return new r32("not_interested_reasons", new j32(2131951985), p7h.M(new o32[]{new o32(p32.TOO_OFTEN, 2131951990, (hux) null, new l32(new vx10("negative_repetitive", str)), 12), new o32(p32.NOT_BRAND, 2131951987, (hux) null, new l32(new vx10("negative_brand", str)), 12), new o32(p32.NOT_PRODUCT, 2131951988, (hux) null, new l32(new vx10("negative_product", str)), 12), new o32(p32.ALREADY_USING, 2131951986, (hux) null, new l32(new vx10("negative_already_using", str)), 12), new o32(p32.SOMETHING_ELSE, 2131951989, (hux) null, new l32(new vx10("negative_something_else", str)), 12)}), null);
    }

    public static final r32 b() {
        return new r32("report_ad_categories", new j32(2131951991), p7h.M(new o32[]{new o32(p32.REPORT_ADULT_CONTENT, 2131951997, (hux) null, new m32("submit_report_adult_content"), 4), new o32(p32.REPORT_DECEPTIVE_MISLEADING, 2131951999, (hux) null, new m32("submit_report_deceptive_misleading"), 4), new o32(p32.REPORT_DANGEROUS_INAPPROPRIATE, 2131951998, (hux) null, new m32("submit_report_dangerous_inappropriate"), 4), new o32(p32.REPORT_ILLEGAL_RESTRICTED, 2131952000, (hux) null, new m32("submit_report_illegal_restricted"), 4), new o32(p32.REPORT_QUALITY_TECHNICAL, 2131952001, (hux) null, new m32("submit_report_quality_technical"), 4)}), new h32());
    }

    public static final List c(String str) {
        return p7h.M(new s32[]{d(8, 2131951997, str), d(9, 2131951999, str), d(10, 2131951998, str), d(11, 2131952000, str), d(12, 2131952001, str)});
    }

    public static final s32 d(int i, int i2, String str) {
        return new s32("submit_".concat(bb00.d(i)), new j32(2131951991), i2, new wx10(bb00.d(i), str));
    }
}
