package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum alz implements v190 {
    success(0),
    aborted(1),
    unsupportedResponse(2),
    nonSuccessfulResponse(3),
    httpTransportError(4),
    unsupportedAuthenticationMethod(5),
    invalidArguments(6),
    unknownBackendError(7),
    invalidCredentials(8),
    badRequest(9),
    unsupportedLoginProtocol(10),
    timeout(11),
    unknownIdentifier(12),
    tooManyAttempts(13),
    invalidPhoneNumber(14),
    tryAgainLater(15),
    hashMismatch(16),
    notAllowed(17),
    UNRECOGNIZED(-1);

    public final int a;

    alz(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
