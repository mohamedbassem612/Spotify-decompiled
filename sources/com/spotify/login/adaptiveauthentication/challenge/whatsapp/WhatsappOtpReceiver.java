package com.spotify.login.adaptiveauthentication.challenge.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.whatsapp.otp.android.sdk.exceptions.HandshakeIdInvalidFormatException;
import com.whatsapp.otp.android.sdk.exceptions.HandshakeIdMismatchException;
import com.whatsapp.otp.android.sdk.exceptions.HandshakeIdMissingException;
import java.util.UUID;
import kotlin.Metadata;
import p.dt71;
import p.jw9;
import p.tml1;
import p.vml1;
import p.wml1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/login/adaptiveauthentication/challenge/whatsapp/WhatsappOtpReceiver;", "Lp/jw9;", "<init>", "()V", "src_main_java_com_spotify_login_adaptiveauthentication-adaptiveauthentication"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WhatsappOtpReceiver extends jw9 {
    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    public final void a(Context context, Intent intent) {
        String strTrim;
        dt71 dt71Var = wml1.a;
        String str = wml1.e;
        if (str == null) {
            Logger.d("WhatsappOtpReceiver", new Object[]{"No handshake ID available, ignoring WhatsApp OTP intent"});
            return;
        }
        vml1 vml1Var = vml1.a;
        try {
            String stringExtra = intent.getStringExtra("request_id");
            if (stringExtra == null) {
                strTrim = null;
            } else {
                strTrim = stringExtra.trim();
                if (strTrim.isEmpty()) {
                    strTrim = null;
                }
            }
            if (strTrim == null) {
                throw new HandshakeIdMissingException();
            }
            try {
                UUID.fromString(strTrim.trim());
                if (!strTrim.equals(str)) {
                    throw new HandshakeIdMismatchException();
                }
                String stringExtra2 = intent.getStringExtra("code");
                if (stringExtra2 == null) {
                    vml1Var.accept(tml1.a, null);
                } else {
                    dt71 dt71Var2 = wml1.a;
                    wml1.a.a(stringExtra2);
                }
            } catch (IllegalArgumentException unused) {
                throw new HandshakeIdInvalidFormatException();
            }
        } catch (HandshakeIdInvalidFormatException e) {
            vml1Var.accept(tml1.c, e);
        } catch (HandshakeIdMismatchException e2) {
            vml1Var.accept(tml1.d, e2);
        } catch (HandshakeIdMissingException e3) {
            vml1Var.accept(tml1.b, e3);
        } catch (Exception e4) {
            vml1Var.accept(tml1.e, e4);
        }
    }
}
