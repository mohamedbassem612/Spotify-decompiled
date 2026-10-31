package p;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ux60 {
    public final HashMap a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public final PackageManager d;
    public final boolean e;

    static {
        new ux60(null, new HashMap(), true);
    }

    public ux60(PackageManager packageManager, HashMap map, boolean z) {
        this.d = packageManager;
        this.a = map;
        this.b = z;
        this.e = packageManager != null && packageManager.hasSystemFeature("android.hardware.type.automotive");
    }

    public static String a(Signature signature) {
        MessageDigest messageDigest;
        byte[] byteArray = signature.toByteArray();
        try {
            messageDigest = MessageDigest.getInstance("SHA256");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(byteArray);
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder((bArrDigest.length * 3) - 1);
        for (byte b : bArrDigest) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:88:0x0042
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final boolean b(p.tw60 r13) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ux60.b(p.tw60):boolean");
    }
}
