package p;

import io.reactivex.rxjava3.core.SingleEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dk4 implements ydy0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SingleEmitter b;
    public final /* synthetic */ ek4 c;

    public /* synthetic */ dk4(SingleEmitter singleEmitter, ek4 ek4Var, byte b) {
        this.a = b;
        this.b = singleEmitter;
        this.c = ek4Var;
    }

    public final pdy0 create(aey0 aey0Var) {
        byte b = this.a;
        ek4 ek4Var = this.c;
        SingleEmitter singleEmitter = this.b;
        switch (b) {
            case 0:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-gen-alpha-blocking:is_allowlisting_management_enabled", false)));
                break;
            case 1:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-gen-alpha-blocking:is_audiobook_allowlisting_management_enabled", false)));
                break;
            case 2:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-gen-alpha-blocking:is_managed_account_allowlisting_requests_page_enabled", false)));
                break;
            case 3:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-gen-alpha-blocking:is_managed_accounts_request_settings_page_enabled", false)));
                break;
            default:
                singleEmitter.onSuccess(Boolean.valueOf(aey0Var.c("android-gen-alpha-blocking:is_my_allowlisting_requests_page_enabled", false)));
                break;
        }
        return ek4Var;
    }
}
