package com.spotify.authentication.accountssetupimpl;

import com.spotify.authentication.accounts.AccountsConfiguration;
import com.spotify.authentication.accountssetup.NativeAccountsSetup;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.connectivity.NativeApplicationScopeAPI;
import kotlin.Metadata;
import p.dln0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096 ¢\u0006\u0004\b\u0005\u0010\u0003R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/spotify/authentication/accountssetupimpl/NativeAccountsSetupImpl;", "Lcom/spotify/authentication/accountssetup/NativeAccountsSetup;", "<init>", "()V", "Lp/rih1;", "destroy", "", "value", "nThis", "J", "getNThis", "()J", "Companion", "p/dln0", "src_main_java_com_spotify_authentication_accountssetupimpl-accountssetupimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class NativeAccountsSetupImpl implements NativeAccountsSetup {
    public static final dln0 Companion = new dln0();
    private long nThis;

    public static final native NativeAccountsSetupImpl create(AccountsConfiguration accountsConfiguration, NativeApplicationScopeAPI nativeApplicationScopeAPI);

    @Override // com.spotify.authentication.accountssetup.NativeAccountsSetup
    public native void destroy();

    @Override // com.spotify.authentication.accountssetup.NativeAccountsSetup
    public long getNThis() {
        return this.nThis;
    }
}
