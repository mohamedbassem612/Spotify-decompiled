package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class dig0 {
    public static final Map a;

    static {
        mmr0 mmr0Var = new mmr0("CATALOGUE_RESTRICTED", xjz.ERROR_CATALOGUE_RESTRICTED);
        mmr0 mmr0Var2 = new mmr0("COUNTRY_RESTRICTED", xjz.ERROR_COUNTRY_RESTRICTED);
        xjz xjzVar = xjz.ERROR_GEORESTRICTED;
        a = sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("geoLocation", xjzVar), new mmr0("GEO_RESTRICTED", xjzVar), new mmr0("MANIFEST_DELETED", xjz.ERROR_MANIFEST_DELETED), new mmr0("UNAVAILABLE", xjz.ERROR_UNAVAILABLE), new mmr0("UNSUPPORTED_CLIENT_VERSION", xjz.ERROR_UNSUPPORTED_CLIENT_VERSION), new mmr0("UNSUPPORTED_PLATFORM_VERSION", xjz.ERROR_UNSUPPORTED_PLATFORM_VERSION)});
    }
}
