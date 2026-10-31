package p;

import com.spotify.share.linkgeneration.api.proto.CustomData;
import com.spotify.share.linkgeneration.api.proto.GenerateUrlRequest;
import com.spotify.share.linkgeneration.api.proto.GenerateUrlResponse;
import com.spotify.share.linkgeneration.api.proto.LinkPreview;
import com.spotify.share.linkgeneration.api.proto.UtmParameters;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ao71 implements bo71 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ao71(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    @Override // p.bo71
    public final Object a(go71 go71Var, onm onmVar) {
        zn71 zn71Var;
        yn71 yn71Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (onmVar instanceof zn71) {
                    zn71Var = (zn71) onmVar;
                    int i = zn71Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        zn71Var.c = i - Integer.MIN_VALUE;
                    } else {
                        zn71Var = new zn71(this, onmVar);
                    }
                } else {
                    zn71Var = new zn71(this, onmVar);
                }
                Object objA = zn71Var.a;
                int i2 = zn71Var.c;
                if (i2 == 0) {
                    hm5.M(objA);
                    String str = go71Var.a;
                    String str2 = go71Var.b;
                    cqi1 cqi1Var = go71Var.c;
                    Map map = go71Var.d;
                    String str3 = go71Var.e;
                    ujc0 ujc0Var = go71Var.f;
                    je40 je40VarP = GenerateUrlRequest.p();
                    je40VarP.r(str);
                    if (cqi1Var != null) {
                        bqi1 bqi1VarN = UtmParameters.n();
                        String str4 = cqi1Var.a;
                        if (str4 != null) {
                            bqi1VarN.n(str4);
                        }
                        String str5 = cqi1Var.b;
                        if (str5 != null) {
                            bqi1VarN.s(str5);
                        }
                        String str6 = cqi1Var.c;
                        if (str6 != null) {
                            bqi1VarN.r(str6);
                        }
                        String str7 = cqi1Var.d;
                        if (str7 != null) {
                            bqi1VarN.t(str7);
                        }
                        String str8 = cqi1Var.e;
                        if (str8 != null) {
                            bqi1VarN.q(str8);
                        }
                        je40VarP.s((UtmParameters) bqi1VarN.build());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (str2 != null) {
                        linkedHashMap.put("context", str2);
                    }
                    if (map != null) {
                        linkedHashMap.putAll(map);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str9 = (String) entry.getKey();
                        String str10 = (String) entry.getValue();
                        ypo ypoVarN = CustomData.n();
                        ypoVarN.n(str9);
                        ypoVarN.q(str10);
                        je40VarP.n((CustomData) ypoVarN.build());
                    }
                    if (str3 == null) {
                        str3 = "unknown";
                    }
                    ypo ypoVarN2 = CustomData.n();
                    ypoVarN2.n("app_destination");
                    ypoVarN2.q(str3);
                    je40VarP.n((CustomData) ypoVarN2.build());
                    if (ujc0Var != null) {
                        tjc0 tjc0VarN = LinkPreview.n();
                        String str11 = ujc0Var.a;
                        if (str11 != null) {
                            tjc0VarN.q(str11);
                        }
                        tjc0VarN.n(ujc0Var.b);
                        je40VarP.q((LinkPreview) tjc0VarN.build());
                    }
                    GenerateUrlRequest generateUrlRequestBuild = je40VarP.build();
                    zn71Var.c = 1;
                    objA = ((m3i1) obj).a(generateUrlRequestBuild, zn71Var);
                    yn71Var = d9n.a;
                    if (objA != yn71Var) {
                    }
                    return yn71Var;
                }
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
                GenerateUrlResponse generateUrlResponse = (GenerateUrlResponse) objA;
                yn71Var = new yn71(generateUrlResponse.o(), generateUrlResponse.getShareId(), generateUrlResponse.p(), generateUrlResponse.n());
                return yn71Var;
            default:
                mmr0 mmr0VarB = ((g971) obj).b(go71Var.a, go71Var.b, go71Var.c, go71Var.d);
                String str12 = (String) mmr0VarB.a;
                return new yn71(str12, (String) mmr0VarB.b, go71Var.a, str12);
        }
    }
}
