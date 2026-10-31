package p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface c510 {
    public static final String a = "packageName";
    public static final String b = "clientId";
    public static final String c = "category";
    public static final String d = "transportType";
    public static final String e = "protocol";

    @ay30("external-integration-recs/v1/{spaces-id}")
    Single<re70> a(@t8s0("spaces-id") String str, @u0z0("signal") List<String> list, @u0z0("page") String str2, @u0z0("per_page") String str3, @u0z0("region") String str4, @u0z0("locale") String str5, @u0z0("platform") String str6, @u0z0("version") String str7, @u0z0("dt") String str8, @u0z0("suppress404") String str9, @u0z0("suppress_response_codes") String str10, @u0z0(a) String str11, @u0z0(b) String str12, @u0z0(c) String str13, @u0z0(d) String str14, @u0z0(e) String str15);
}
