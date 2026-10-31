package com.spotify.bluejay.confirmgenerationpage.effecthandler;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p.dmc1;
import p.eg;
import p.emc1;
import p.exd0;
import p.fmc1;
import p.gl7;
import p.gmc1;
import p.hl7;
import p.ihc1;
import p.il7;
import p.jl7;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/spotify/bluejay/confirmgenerationpage/effecthandler/AttachmentNotSafeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "src_main_java_com_spotify_bluejay_confirmgenerationpage-confirmgenerationpage"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class AttachmentNotSafeException extends RuntimeException {
    public final gmc1 a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public AttachmentNotSafeException(jl7 jl7Var) throws NoWhenBranchMatchedException {
        fmc1 fmc1Var;
        super(exd0.o(jl7Var));
        if (jl7Var instanceof hl7) {
            String strA = ((hl7) jl7Var).a();
            if (strA == null) {
                fmc1Var = emc1.a;
            } else {
                String str = ihc1.y0(strA) ? null : strA;
                if (str != null) {
                    fmc1Var = new fmc1(str);
                } else {
                    fmc1Var = emc1.a;
                }
            }
        } else {
            boolean zEquals = jl7Var.equals(gl7.a);
            fmc1 fmc1Var2 = dmc1.a;
            if (!zEquals && !jl7Var.equals(il7.a)) {
                eg.o();
                throw null;
            }
            fmc1Var = fmc1Var2;
        }
        this.a = fmc1Var;
    }
}
