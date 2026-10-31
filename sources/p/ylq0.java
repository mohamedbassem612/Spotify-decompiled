package p;

import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ylq0 {
    public static final Map b = Collections.singletonMap(zlq0.a, new mmr0(f46.S0(new String[]{"fb_iap_package_name", "fb_iap_subs_auto_renewing", "fb_free_trial_period", "fb_intro_price_amount_micros", "fb_intro_price_cycles", "fb_iap_base_plan", "is_implicit_purchase_logging_enabled", "fb_iap_sdk_supported_library_versions", "is_autolog_app_events_enabled", "fb_iap_client_library_version", "fb_iap_subs_period", "fb_iap_purchase_token", "fb_iap_non_deduped_event_time", "fb_iap_actual_dedup_result", "fb_iap_actual_dedup_key_used", "fb_iap_test_dedup_result", "fb_iap_test_dedup_key_used"}), f46.S0(new String[]{"fb_iap_product_id", "fb_iap_product_type", "fb_iap_purchase_time"})));
    public final LinkedHashMap a = new LinkedHashMap();

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public final void a(zlq0 zlq0Var, String str, Object obj) throws FacebookException {
        LinkedHashMap linkedHashMap = this.a;
        try {
            HashSet hashSet = bm5.f;
            q0o1.o(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2)));
            }
            if (!linkedHashMap.containsKey(zlq0Var)) {
                linkedHashMap.put(zlq0Var, new LinkedHashMap());
            }
            Map map = (Map) linkedHashMap.get(zlq0Var);
            if (map != null) {
                map.put(str, obj);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public final ylq0 b() throws FacebookException {
        ylq0 ylq0Var = new ylq0();
        LinkedHashMap linkedHashMap = this.a;
        for (zlq0 zlq0Var : linkedHashMap.keySet()) {
            Map map = (Map) linkedHashMap.get(zlq0Var);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        ylq0Var.a(zlq0Var, str, obj);
                    }
                }
            }
        }
        return ylq0Var;
    }
}
