package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class aep0 {
    public static final List a = p7h.M(new String[]{"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"});
    public static final List b = p7h.M(new String[]{"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"});
    public static final List c = p7h.M(new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"});
    public static final List d = p7h.M(new String[]{"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"});
    public static final List e = p7h.M(new String[]{"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"});
    public static final List f = p7h.M(new String[]{"magisk", "core/mirror", "core/img"});
    public static final List g = p7h.M(new mmr0[]{new mmr0("ro.debuggable", "[1]"), new mmr0("ro.secure", "[0]")});

    public static List a() {
        ArrayList arrayList = new ArrayList();
        List list = d;
        arrayList.addAll(list);
        String str = System.getenv("PATH");
        if (((str == null || str.length() == 0) ? str : null) != null) {
            return list;
        }
        if (str != null) {
            for (String str2 : ihc1.Q0(str, new String[]{":"}, 0, 6)) {
                boolean zR = nhc1.R(str2, "/", false);
                Boolean boolValueOf = Boolean.valueOf(zR);
                if (zR) {
                    boolValueOf = null;
                }
                String strConcat = boolValueOf != null ? str2.concat("/") : "";
                boolean zContains = arrayList.contains(strConcat);
                Boolean boolValueOf2 = Boolean.valueOf(zContains);
                if (zContains) {
                    boolValueOf2 = null;
                }
                if (boolValueOf2 != null) {
                    arrayList.add(strConcat);
                }
            }
        }
        return arrayList;
    }
}
