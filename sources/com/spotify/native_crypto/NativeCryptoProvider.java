package com.spotify.native_crypto;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import p.amn0;
import p.bmn0;
import p.f46;
import p.hhg1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\bJ%\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0004\b#\u0010\u0019J\u001d\u0010&\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\bJ\u0015\u0010'\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u001cJ\u001b\u0010)\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017¢\u0006\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/spotify/native_crypto/NativeCryptoProvider;", "", "<init>", "()V", "", "key", "data", "hmacSha512", "([B[B)[B", "nonce", "plaintext", "aad", "chachaEncrypt", "([B[B[B[B)[B", "ciphertext", "chachaDecrypt", "salt", "info", "ikm", "", "length", "hkdfSha512", "([B[B[BI)[B", "", "ed25519GenerateKeypair", "()[[B", "seed", "ed25519PublicKeyFromSeed", "([B)[B", "ed25519Sign", "pubkey", "signature", "", "ed25519Verify", "([B[B[B)Z", "x25519GenerateKeypair", "ourPrivate", "peerPublic", "x25519SharedSecret", "sha512", "fragments", "sha512Incremental", "([[B)[B", "Companion", "p/amn0", "shared_native_crypto_native_crypto_jni-native_crypto_jni_kt"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class NativeCryptoProvider {
    public static final amn0 Companion = new amn0();
    private static final byte[] ED25519_PKCS8_PREFIX = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};
    private static final byte[] ED25519_X509_PREFIX = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    private static final byte[] X25519_PKCS8_PREFIX = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    private static final byte[] X25519_X509_PREFIX = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};

    private final byte[] hmacSha512(byte[] key, byte[] data) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA512");
        mac.init(new SecretKeySpec(key, "HmacSHA512"));
        return mac.doFinal(data);
    }

    public final byte[] chachaDecrypt(byte[] key, byte[] nonce, byte[] ciphertext, byte[] aad) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305");
        cipher.init(2, new SecretKeySpec(key, "ChaCha20"), new IvParameterSpec(nonce));
        cipher.updateAAD(aad);
        return cipher.doFinal(ciphertext);
    }

    public final byte[] chachaEncrypt(byte[] key, byte[] nonce, byte[] plaintext, byte[] aad) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305");
        cipher.init(1, new SecretKeySpec(key, "ChaCha20"), new IvParameterSpec(nonce));
        cipher.updateAAD(aad);
        return cipher.doFinal(plaintext);
    }

    public final byte[][] ed25519GenerateKeypair() {
        KeyPair keyPairGenerateKeyPair = KeyPairGenerator.getInstance("Ed25519").generateKeyPair();
        amn0 amn0Var = Companion;
        byte[] encoded = keyPairGenerateKeyPair.getPrivate().getEncoded();
        amn0Var.getClass();
        return new byte[][]{amn0.b(encoded), amn0.c(keyPairGenerateKeyPair.getPublic().getEncoded())};
    }

    public final byte[] ed25519PublicKeyFromSeed(byte[] seed) throws NoSuchAlgorithmException {
        SecureRandom bmn0Var = new bmn0(seed);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("Ed25519");
        keyPairGenerator.initialize(255, bmn0Var);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        amn0 amn0Var = Companion;
        byte[] encoded = keyPairGenerateKeyPair.getPublic().getEncoded();
        amn0Var.getClass();
        return amn0.c(encoded);
    }

    public final byte[] ed25519Sign(byte[] seed, byte[] data) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Companion.getClass();
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("Ed25519").generatePrivate(new PKCS8EncodedKeySpec(f46.x0(ED25519_PKCS8_PREFIX, seed)));
        Signature signature = Signature.getInstance("Ed25519");
        signature.initSign(privateKeyGeneratePrivate);
        signature.update(data);
        return signature.sign();
    }

    public final boolean ed25519Verify(byte[] pubkey, byte[] data, byte[] signature) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Companion.getClass();
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("Ed25519").generatePublic(new X509EncodedKeySpec(f46.x0(ED25519_X509_PREFIX, pubkey)));
        Signature signature2 = Signature.getInstance("Ed25519");
        signature2.initVerify(publicKeyGeneratePublic);
        signature2.update(data);
        return signature2.verify(signature);
    }

    public final byte[] hkdfSha512(byte[] salt, byte[] info, byte[] ikm, int length) throws NoSuchAlgorithmException, InvalidKeyException {
        if (salt.length == 0) {
            salt = new byte[64];
        }
        byte[] bArrHmacSha512 = hmacSha512(salt, ikm);
        if (length > 16320) {
            hhg1.f("HKDF output length exceeds maximum (16320)");
            return null;
        }
        int i = (length + 63) / 64;
        byte[] bArr = new byte[length];
        byte[] bArrHmacSha513 = new byte[0];
        if (1 <= i) {
            int i2 = 0;
            int i3 = 1;
            while (true) {
                bArrHmacSha513 = hmacSha512(bArrHmacSha512, f46.x0(f46.x0(bArrHmacSha513, info), new byte[]{(byte) i3}));
                int iMin = Math.min(64, length - i2);
                System.arraycopy(bArrHmacSha513, 0, bArr, i2, iMin);
                i2 += iMin;
                if (i3 == i) {
                    break;
                }
                i3++;
            }
        }
        return bArr;
    }

    public final byte[] sha512(byte[] data) {
        return MessageDigest.getInstance("SHA-512").digest(data);
    }

    public final byte[] sha512Incremental(byte[][] fragments) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        for (byte[] bArr : fragments) {
            messageDigest.update(bArr);
        }
        return messageDigest.digest();
    }

    public final byte[][] x25519GenerateKeypair() {
        KeyPair keyPairGenerateKeyPair = KeyPairGenerator.getInstance("X25519").generateKeyPair();
        amn0 amn0Var = Companion;
        byte[] encoded = keyPairGenerateKeyPair.getPrivate().getEncoded();
        amn0Var.getClass();
        return new byte[][]{amn0.b(encoded), amn0.c(keyPairGenerateKeyPair.getPublic().getEncoded())};
    }

    public final byte[] x25519SharedSecret(byte[] ourPrivate, byte[] peerPublic) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        KeyFactory keyFactory = KeyFactory.getInstance("X25519");
        amn0 amn0Var = Companion;
        amn0Var.getClass();
        PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(f46.x0(X25519_PKCS8_PREFIX, ourPrivate)));
        amn0Var.getClass();
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(f46.x0(X25519_X509_PREFIX, peerPublic)));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("X25519");
        keyAgreement.init(privateKeyGeneratePrivate);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }
}
